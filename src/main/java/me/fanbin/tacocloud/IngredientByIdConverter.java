package me.fanbin.tacocloud;

import lombok.extern.apachecommons.CommonsLog;
import me.fanbin.tacocloud.data.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author fanbin
 * @date 2020/2/29
 */
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepository;

    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findOne(id);
    }
}

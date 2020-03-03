package me.fanbin.tacocloud.data;

import me.fanbin.tacocloud.Ingredient;

/**
 * @author fanbin
 * @date 2020/2/29
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}

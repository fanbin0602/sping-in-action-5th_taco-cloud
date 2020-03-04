package me.fanbin.tacocloud.data;

import me.fanbin.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author fanbin
 * @date 2020/2/29
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Ingredient findOne(String id);

}

package me.fanbin.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author fanbin
 * @date 2020/2/27
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    /**
     *
     */
    public enum Type {
        /**
         *
         */
        WRAP,

        /**
         *
         */
        PROTEIN,

        /**
         *
         */
        VEGGIES,

        /**
         *
         */
        CHEESE,


        /**
         *
         */
        SAUCE
    }

}

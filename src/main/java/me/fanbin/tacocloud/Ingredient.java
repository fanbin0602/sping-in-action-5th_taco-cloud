package me.fanbin.tacocloud;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fanbin
 * @date 2020/2/27
 */
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Ingredient {

    @Id
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

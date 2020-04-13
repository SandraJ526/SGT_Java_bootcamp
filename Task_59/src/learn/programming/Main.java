package learn.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ingredient salt = new Ingredient("salt");
        Ingredient egg = new Ingredient("egg");
        Ingredient bacon = new Ingredient("bacon");
        Ingredient water = new Ingredient("water");
        Ingredient milk = new Ingredient("milk");

        List<Ingredient> listStockIngredients = new ArrayList<>();
        //listStockIngredients.add(salt);
        listStockIngredients.add(egg);
        listStockIngredients.add(bacon);
        listStockIngredients.add(water);
        listStockIngredients.add(milk);

        List<Ingredient> listRecipeIngredients = new ArrayList<>();
        listRecipeIngredients.add(salt);
        listRecipeIngredients.add(egg);
        listRecipeIngredients.add(bacon);

        Recipe omelette = new Recipe("Omelette", listRecipeIngredients);

        omelette.make(listRecipeIngredients, listStockIngredients);
    }
}

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

        List<Ingredient> stockIngredients = new ArrayList<>();
        //stockIngredients.add(salt);
        stockIngredients.add(egg);
        stockIngredients.add(bacon);
        stockIngredients.add(water);
        stockIngredients.add(milk);

        List<Ingredient> recipeIngredients = new ArrayList<>();
        recipeIngredients.add(salt);
        recipeIngredients.add(egg);
        recipeIngredients.add(bacon);

        Recipe omelette = new Recipe("Omelette", recipeIngredients);

        omelette.make(recipeIngredients, stockIngredients);
    }
}

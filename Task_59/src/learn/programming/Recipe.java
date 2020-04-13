package learn.programming;


import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Recipe {

    private static String name;
    List<Ingredient> recipeIngredients;

    public Recipe(String name, List<Ingredient> recipeIngredients) {
        Recipe.name = name;
        this.recipeIngredients = recipeIngredients;
    }

    public static @NotNull String getName() {
        return name;
    }

    public static void make(List<Ingredient> recipeIngredients, @NotNull List<Ingredient> stockIngredients) {
        String name = getName();
        if (stockIngredients.containsAll(recipeIngredients)) {
            System.out.println(name + " is ready.");
        } else {
            System.out.println("Cannot prepare " + name.toLowerCase() + " due to missing ingredient(s): ");
            getMissingIngredient(recipeIngredients, stockIngredients);
        }
    }

    public static void getMissingIngredient(@NotNull List<Ingredient> recipeIngredients,
                                            @NotNull List<Ingredient> stockIngredients) {

        HashSet<Ingredient> availableIngredients = new HashSet<>(stockIngredients);
        availableIngredients.addAll(stockIngredients);
        for (int i = 0; i < recipeIngredients.size(); i++) {
            if (!availableIngredients.contains(recipeIngredients.get(i))) {
                System.out.print(recipeIngredients.get(i));
            }
        }
    }
}







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

    public static void make(List<Ingredient> listRecipeIngredients, @NotNull List<Ingredient> listStockIngredients) {
        String name = getName();
        if (listStockIngredients.containsAll(listRecipeIngredients)) {
            System.out.println(name + " is ready.");
        } else {
            System.out.println("Cannot prepare " + name.toLowerCase() + " due to missing ingredient(s): ");
            getMissingIngredient(listRecipeIngredients, listStockIngredients);
        }
    }

    public static void getMissingIngredient(@NotNull List<Ingredient> listRecipeIngredients,
                                            @NotNull List<Ingredient> listStockIngredients) {

        HashSet<Ingredient> availableIngredients = new HashSet<>(listStockIngredients);
        availableIngredients.addAll(listStockIngredients);
        for (int i = 0; i < listRecipeIngredients.size(); i++) {
            if (!availableIngredients.contains(listRecipeIngredients.get(i))) {
                System.out.print(listRecipeIngredients.get(i));
            }
        }
    }
}







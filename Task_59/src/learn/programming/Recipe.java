package learn.programming;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Recipe {

    private static String name;
    List<String> recipeIngredients;

    public Recipe(String name, List<String> recipeIngredients) {
        this.name = name;
        this.recipeIngredients = recipeIngredients;
    }

    public static @NotNull String getName() {
        return name;
    }

    public static void make(List<String> listRecipeIngredients, @NotNull List<String> listStockIngredients) {
        String name = getName();
        if (listStockIngredients.containsAll(listRecipeIngredients)) {
            System.out.println(name + " is ready.");
        } else {
            System.out.print("Cannot prepare " + name.toLowerCase() + " due to missing ingredient(s): ");
            listRecipeIngredients.removeAll(listStockIngredients);
            System.out.print(listRecipeIngredients);
        }
        System.out.println();
    }
}


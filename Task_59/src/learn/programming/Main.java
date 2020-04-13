package learn.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listStockIngredients = new ArrayList<>();
        listStockIngredients.add("sugar");
        listStockIngredients.add("egg");
        listStockIngredients.add("bacon");
        listStockIngredients.add("salt");
        listStockIngredients.add("water");
        listStockIngredients.add("milk");


        List<String> listRecipeIngredients = new ArrayList<>();
        listRecipeIngredients.add("salt");
        listRecipeIngredients.add("egg");
        listRecipeIngredients.add("bacon");

        Recipe omelette = new Recipe("Omelette", listRecipeIngredients);

        omelette.make(listRecipeIngredients, listStockIngredients);
    }
}

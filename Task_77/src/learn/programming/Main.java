package learn.programming;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PeriodicTableElements> chemicalElements = new ArrayList<>();
        PeriodicTableElements item1 = new PeriodicTableElements("Hydrogen", "H", (short) 1,
                1.008, "Other nonmetals");
        PeriodicTableElements item2 = new PeriodicTableElements("Oxygen", "O", (short) 8,
                15.999, "Other nonmetals");
        PeriodicTableElements item3 = new PeriodicTableElements("Chromium", "Cr", (short) 24,
                51.996, "Transition metals");

        chemicalElements.add(item1);
        chemicalElements.add(item2);
        chemicalElements.add(item3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (Writer writer = new FileWriter("C:\\tmp\\periodicTableElements.json")) {
            gson.toJson(chemicalElements, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Reader reader = new FileReader("C:\\tmp\\periodicTableElements.json");
            Type listType = new TypeToken<List<PeriodicTableElements>>(){}.getType();
            List<PeriodicTableElements> chemicalElementsDes = gson.fromJson(reader, listType);
            System.out.println(chemicalElementsDes.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package learn.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        KitchenTable kTable1 = new KitchenTable(80, 100, 70, "modern", false);
        kTable1.extend(30); //will not change width because boolean extendable = false
        KitchenTable kTable2 = new KitchenTable(90, 90, 80, "classic", true);
        kTable2.extend(50);
        KitchenTable kTable3 = new KitchenTable(70, 140, 60, "modern", false);

        StudyTable sTable1 = new StudyTable(75, 85, 55, "wood");
        sTable1.addDrawer(2);
        StudyTable sTable2 = new StudyTable(63, 92, 60, "laminate");
        StudyTable sTable3 = new StudyTable(71, 90, 75, "veneer");
        sTable3.addDrawer(1);
        sTable3.removeDrawers();

        List<Table> tables = Arrays.asList(kTable1, kTable2, kTable3, sTable1, sTable2, sTable3);
        List<KitchenTable> kitchenTables = Arrays.asList(kTable1, kTable2, kTable3);
        List<StudyTable> studyTables = Arrays.asList(sTable1, sTable2, sTable3);

        System.out.println("Tables with width smaller than 100: ");
        tables.stream()
                .filter(table -> table.getWidth() < 100)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Adjustible kitchen tables: ");
        kitchenTables.stream()
                .filter(kitchenTable -> kitchenTable.isAdjustible())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Study tables with drawers: ");
        studyTables.stream()
                .filter(studyTable -> !studyTable.isStackable())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Study tables with no drawers (stackable): ");
        studyTables.stream()
                .filter(StudyTable::isStackable)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

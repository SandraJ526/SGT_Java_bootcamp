package learn.programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "Model 3 Long range", 57900d, "black", (short) 2019);
        Car car2 = new Car("Porsche", "Taycan 4S", 129995d, "grey", (short) 2020);
        Car car3 = new Car("Lexus", "RX 450h ", 54980d, "blue metallic", (short) 2019);
        Car car4 = new Car("Audi", "e-tron", 67295d, "grey metallic", (short) 2020);
        Car car5 = new Car("Renault ", "ZOE EXPERIENCE ", 19825d, "purple", (short) 2020);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Comparator<Car> comparator = Comparator.comparing(Car::getPrice);

        Car maxPrice = cars.stream().max(comparator).get();

        System.out.println(maxPrice);
    }
}

package learn.programming;

public class Car {

    private String make;
    private String model;
    private double price;
    private String color;
    private short year;

    public Car(String make, String model, double price, String color, short year) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                make + ", " +
                model + ", " +
                price + ", " +
                color + ", " +
                year + ".";
    }
}

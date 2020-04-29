package learn.programming;

public class Volvo {

    private String model;
    private String make;
    private int year;
    private double price;

    @Override
    public String toString() {
        return "Volvo{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package learn.programming;

public class Chair {

    private String type;
    private String material;
    private short height;
    private short width;
    private double price;

    public Chair(String type, String material, short height, short width, double price) {
        this.type = type;
        this.material = material;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public short getHeight() {
        return height;
    }

    public short getWidth() {
        return width;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chair: " +
                "type= " + type +
                ", material= " + material +
                ", height= " + height +
                ", width= " + width +
                ", price= " + price;
    }
}

package learn.programming;

import com.fasterxml.jackson.databind.JsonNode;

public class House {

    private JsonNode address;
    private String color;
    private int stores;

    public JsonNode getAddress() {
        return address;
    }

    public void setAddress(JsonNode address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStores() {
        return stores;
    }

    public void setStores(int stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", color='" + color + '\'' +
                ", stores=" + stores +
                '}';
    }
}


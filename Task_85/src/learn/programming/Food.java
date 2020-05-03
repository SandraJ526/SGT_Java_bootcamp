package learn.programming;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("food")
public class Food {

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("price")
    private String price;

    @XStreamAlias("description")
    private String description;

    @XStreamAlias("calories")
    private int calories;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", calories=" + calories +
                '}';
    }
}



package learn.programming;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("breakfast_menu")
public class Menu {

    @XStreamImplicit(itemFieldName = "food")
    private List<Food> foods;

    @Override
    public String toString() {
        return "Menu{" +
                "foods=" + foods +
                '}';
    }
}



package learn.programming;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "CATALOG")
public class Catalog {

    @ElementList(inline = true, required = false)
    private List<CD> cdList;

    public Catalog(List<CD> cdList) {
        this.cdList = cdList;
    }
    private Catalog(){

    }

    public List<CD> getCdList() {
        return cdList;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "\n cdList=" + cdList +
                '}';
    }
}

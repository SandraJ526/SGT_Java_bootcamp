package learn.programming;

public class PeriodicTableElements {

    private String name;
    private String elementSymbol;
    private short atomicNumber;
    private double atomicWeight;
    private String group;

    public PeriodicTableElements(String name, String elementSymbol, short atomicNumber,
                                 double atomicWeight, String group) {
        this.name = name;
        this.elementSymbol = elementSymbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    public short getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "PeriodicTableElements{" +
                "name='" + name + '\'' +
                ", elementSymbol='" + elementSymbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                ", group='" + group + '\'' +
                '}';
    }
}

package learn.programming;

public class KitchenTable extends Table {

    private String type;
    private boolean adjustible;

    public KitchenTable(int height, int width, int depth, String type, boolean adjustible) {
        super(height, width, depth);
        this.type = type;
        this.adjustible = adjustible;
    }

    public int extend(int sizeOfExtension) {
        if (adjustible) {
            return setWidth(getWidth() + sizeOfExtension);
        }
        return getWidth();
    }

    public String getType() {
        return type;
    }

    public boolean isAdjustible() {
        return adjustible;
    }

    @Override
    public String toString() {
        return "KitchenTable {" +
                "height= " + getHeight() +
                ", width= " + getWidth() +
                ", depth= " + getDepth() +
                ", type= " + getType() +
                ", adjustible=" + adjustible +
                "} ";
    }
}




package learn.programming;

public class StudyTable extends Table {

    private String material;
    private int numberOfDrawers;


    public StudyTable(int height, int width, int depth, String material) {
        super(height, width, depth);
        this.material = material;
    }

    public int addDrawer(int numberOfDrawers) {
        return this.numberOfDrawers = numberOfDrawers;
    }
    public int removeDrawers(){
        return this.numberOfDrawers =0;
    }

    public boolean isStackable() {
        return numberOfDrawers == 0 ? true : false;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "StudyTable {" +
                "height= " + getHeight() +
                ", width= " + getWidth() +
                ", depth= " + getDepth() +
                ", material= " + material +
                ", numberOfDrawers= " + numberOfDrawers +
                ", stackable= " + isStackable() +
                "} ";
    }
}

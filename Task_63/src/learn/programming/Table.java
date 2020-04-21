package learn.programming;

public class Table {
    private int height;
    private int width;
    private int depth;

    public Table(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int setWidth(int width) {
        this.width = width;
        return width;
    }

    public int getDepth() {
        return depth;
    }
}

package learn.programming;

public class PrintBook extends Book {

    private int weight;

    public PrintBook(String author, int pages, int weight) {
        super(author, pages);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

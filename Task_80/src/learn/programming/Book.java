package learn.programming;

public class Book {

    private String author;
    private int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public void printAuthorAndNumberOfPages() {
        System.out.println("Author is " + getAuthor() + ", " + getPages() + " pages.");
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

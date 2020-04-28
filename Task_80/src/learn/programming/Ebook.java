package learn.programming;

public class Ebook extends Book {

    private String urlAddress;

    public Ebook(String author, int pages, String urlAddress) {
        super(author, pages);
        this.urlAddress = urlAddress;
    }

    public String getUrlAddress() {
        return urlAddress;
    }
}

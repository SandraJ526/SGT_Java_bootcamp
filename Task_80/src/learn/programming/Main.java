package learn.programming;

public class Main {

    public static void main(String[] args) {

        PrintBook book1 = new PrintBook("Author1", 300, 500);
        Ebook book2 = new Ebook("Author2", 200, "www.books.com");

        book1.printAuthorAndNumberOfPages();
        book2.printAuthorAndNumberOfPages();

        System.out.println(book1.getWeight());
        System.out.println(book2.getUrlAddress());
    }
}

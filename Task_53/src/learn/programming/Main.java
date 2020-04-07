package learn.programming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Agatha", "Christie");
        Author author3 = new Author("Joanne", "Rowling");

        Book book1 = new Book("Cards on the Table", author2, 1936);
        Book book2 = new Book("Dreamcatcher", author1, 2001);
        Book book3 = new Book("Fantastic Beasts and Where to Find Them", author3, 2001);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Find books published after 2000: ");
        books.stream()
                .filter(book -> book.getPublishYear() > 2000)
                .forEach(System.out::println);

        System.out.println("Find a book by a keyword:");
        books.stream()
                .filter(book -> book.getTitle().contains("on"))
                .forEach(System.out::println);

        System.out.println("Find a book by author's surname:");
        books.stream()
                .filter(book -> book.getAuthor().getSurname().equals("King"))
                .forEach(System.out::println);
    }

    public static class Book {

        private String title;
        private Author author;
        private int publishYear;


        public Book(String title, Author author, int publishYear) {
            this.title = title;
            this.author = author;
            this.publishYear = publishYear;
        }

        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublishYear() {
            return publishYear;
        }

        @Override
        public String toString() {
            return  "Title:'" + title + '\'' +
                    ", author " + author +
                    ", year " + getPublishYear();
        }
    }
}
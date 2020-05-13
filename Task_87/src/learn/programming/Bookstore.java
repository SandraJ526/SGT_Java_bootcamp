package learn.programming;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "bookstore")
public class Bookstore {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "book")
    private List<Book> books = new ArrayList<>();

    @Override
    public String toString() {
        return "Bookstore{" +
                "books=" + books +
                '}';
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}


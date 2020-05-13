package learn.programming;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "book")
public class Book {

    @JacksonXmlProperty(isAttribute = true)
    private String category;

    @JacksonXmlProperty
    private Title title;

    @JacksonXmlProperty
    private String author;

    @JacksonXmlProperty
    private int year;

    @JacksonXmlProperty
    private double price;

    @Override
    public String toString() {
        return "\nBook{" +
                "category='" + category + '\'' +
                ", title " + title +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



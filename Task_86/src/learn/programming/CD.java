package learn.programming;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "CD")
public class CD {

    @Element(name = "TITLE")
    private String title;

    @Element(name = "ARTIST")
    private String artist;

    @Element(name = "COUNTRY")
    private String country;

    @Element(name = "COMPANY")
    private String company;

    @Element(name = "PRICE")
    private double price;

    @Element(name = "YEAR")
    private int year;

    public CD(String title, String artist, String country, String company, double price, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.company = company;
        this.price = price;
        this.year = year;
    }

    private CD(){

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getCountry() {
        return country;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\n CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

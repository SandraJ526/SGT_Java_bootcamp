package learn.programming;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "email")
public class Email {

    @JacksonXmlProperty
    private String to;

    @JacksonXmlProperty
    private String from;

    @JacksonXmlProperty
    private String heading;

    @JacksonXmlProperty
    private String body;

    @Override
    public String toString() {
        return "\nEmail{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", heading='" + heading + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

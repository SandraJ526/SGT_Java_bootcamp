package learn.programming;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "emails")
public class Emails {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "email")
    private List<Email> emails = new ArrayList<>();

    @Override
    public String toString() {
        return "Emails{" +
                "emails=" + emails +
                '}';
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}

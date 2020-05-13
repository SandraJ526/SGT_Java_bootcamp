package learn.programming;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Title {

    @JacksonXmlText
    private String title;

    @JacksonXmlProperty(isAttribute = true)
    private String lang;

    @Override
    public String toString() {
        return "lang='" + lang + "\'," + '\'' + title + '\'';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}

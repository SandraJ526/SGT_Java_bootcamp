package learn.programming;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Bookstore localFile;

        File xmlSourceFile = new File("C:\\tmp\\sample4.xml");
        localFile = readFile(xmlSourceFile);

        File xmlNewFile = new File("C:\\tmp\\sample4_2.xml");
        writeFile(xmlNewFile, localFile);

    }

    public static Bookstore readFile(File file) {

        Bookstore localFile = null;
        XmlMapper mapper = new XmlMapper();
        Reader reader = null;

        try {
            reader = new FileReader(file);
            localFile = mapper.readValue(reader, Bookstore.class);
            System.out.println(localFile.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return localFile;
    }

    public static void writeFile(File file, Bookstore books) {

        XmlMapper mapper = new XmlMapper();
        Writer writer = null;

        try {
            mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
            writer = new FileWriter(file);
            mapper.writerWithDefaultPrettyPrinter().writeValue(writer, books);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



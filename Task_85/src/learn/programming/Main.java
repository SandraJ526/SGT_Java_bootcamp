package learn.programming;


import com.thoughtworks.xstream.XStream;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        XStream xStream = new XStream();

        xStream.processAnnotations(Menu.class);

        Object readObject = xStream.fromXML(new File("C:\\tmp\\sample2.xml"));

        System.out.println(readObject);

        File anotherFile = new File("C:\\tmp\\sample2_2.xml");

        try {
            FileOutputStream outputStream = new FileOutputStream(anotherFile);
            outputStream.write("<?xml version=\"1.0\"?>\n".getBytes("UTF-8"));

            var xml = xStream.toXML(readObject);
            byte[] bytes = xml.getBytes("UTF-8");

            outputStream.write(bytes);
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




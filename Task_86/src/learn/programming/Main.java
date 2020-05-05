package learn.programming;


import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Serializer serializer = new Persister();
        File sourceFile = new File("C:\\tmp\\sample3.xml");

        try {
            Catalog catalog = serializer.read(Catalog.class, sourceFile);
            System.out.println(catalog.toString());

            File catalog1 = new File("C:\\tmp\\sample3_2.xml");
            String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            serializer.write(xmlDeclaration,catalog1);
            serializer.write(catalog, catalog1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

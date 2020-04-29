package learn.programming;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            Volvo volvos = new ObjectMapper().readValue(new File("C:\\tmp\\test2.json"),
                    new TypeReference<List<Volvo>>(){});
            System.out.println(volvos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

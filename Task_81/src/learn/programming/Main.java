package learn.programming;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String valuesFromFile = "";

        try {
            valuesFromFile = FileUtils.readFileToString(new File("C:\\tmp\\test.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student student1 = new Gson().fromJson(valuesFromFile, Student.class);

        System.out.println(student1);

        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSurname());
        System.out.println(Arrays.toString(student1.getGrades()));
    }
}

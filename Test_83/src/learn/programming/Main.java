package learn.programming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        String valuesFromJson = "";
        House house = null;

        try {
            valuesFromJson = FileUtils.readFileToString(new File("C:\\tmp\\test3.json"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            house = new ObjectMapper().readValue(valuesFromJson, House.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(house);
        System.out.println(house.getAddress());
        System.out.println(house.getAddress().path("street").toString());
        System.out.println(house.getAddress().path("number").toString());
        System.out.println(house.getAddress().path("postalIndex").toString());
        System.out.println(house.getColor());
        System.out.println(house.getStores());
    }
}

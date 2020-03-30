package learn.programming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10"};
        String[] surnames = {"Surn1", "Surn2", "Surn3", "Surn4", "Surn5", "Surn6", "Surn7", "Surn8", "Surn9", "Surn10"};
        String[] fullNames = new String[10];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < surnames.length; j++) {

                fullNames[i] = names[i] + " " + surnames[i];
            }
        }
        System.out.println(Arrays.toString(fullNames));
    }
}


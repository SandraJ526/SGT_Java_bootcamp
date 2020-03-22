package learn.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int treeType = 0;
        int height = 0;
        int diameter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type of spruce: Norway (1) or Blue (2)? ");
        treeType = sc.nextInt();
        if (treeType == 2) {
            System.out.println("Place it in the fireplace hall");
            return;

        } else if (treeType == 1) {
            System.out.println("Please enter height in cm: ");
            height = sc.nextInt();
            System.out.println("Please enter diameter ir cm: ");
            diameter = sc.nextInt();


            if (height >= 50 || height < 100 && diameter >= 100 || diameter < 150) {
                System.out.println("Place it in the living room 1");
            } else if (height >= 100 || height < 150 && diameter >= 150 || diameter < 200) {
                System.out.println("Place it in the living room 2");
            } else if (height >= 150 || height <= 300 && diameter >= 200 || diameter <= 300) {
                System.out.println("Place it in the living room 3");
            } else {
                System.out.println("Find a special place for this tree");
            }
        }
    }
}



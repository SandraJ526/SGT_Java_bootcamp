package learn.programming;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double width = 3.0;
        System.out.println("Please enter freight width: ");
        double widthUser = sc.nextDouble();
        if (widthUser > width) {
            System.out.println("Requested width exceeds our capacity of " + width + " meters");
            return;
        }
        double height = 2.0;
        System.out.println("Please enter freight height: ");
        double heightUser = sc.nextDouble();
        if (heightUser > height) {
            System.out.println("Requested height exceeds our capacity of " + height + " meters");
            return;
        }
        double length1 = 6.0;
        double length2 = 9.0;
        double length3 = 12.0;
        System.out.println("Please enter freight length: ");
        double lengthUser = sc.nextDouble();
        if (lengthUser > length3) {
            System.out.println("Requested length exceeds our capacity of " + length3 + " meters");
            return;
        }
        double weight1 = 3.0;
        double weight2 = 6.0;
        double weight3 = 9.0;
        System.out.println("Please enter freight weight: ");
        double weightUser = sc.nextDouble();
        if (weightUser > weight3) {
            System.out.println("Requested weight exceeds our capacity of " + weight3 + " tonnes");
            return;
        }
        if (lengthUser <= length1 && weightUser <= weight1) {
            System.out.println("Truck 1");
        } else if (lengthUser <= length2 && weightUser <= weight2) {
            System.out.println("Truck 2");
        } else if (lengthUser <= length3 && weightUser <= weight3) {
            System.out.println("Truck 3");
        }
    }
}

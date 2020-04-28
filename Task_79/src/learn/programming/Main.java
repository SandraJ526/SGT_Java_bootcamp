package learn.programming;

public class Main {

    public static void main(String[] args) {

        Model model1 = new Model("Residential", "Outdoors", "iRobot", "Looj", 330);

        System.out.println(model1.getPurposeType());
        System.out.println(model1.getOperatingEnvironment());
        System.out.println(model1.getBrandName());
        System.out.println(model1.getModelName());
        System.out.println(model1.getModelNumber());
    }
}
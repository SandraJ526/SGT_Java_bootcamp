package learn.programming;

public class Model extends Brand {

    private String modelName;
    private int modelNumber;

    public Model(String purposeType, String operatingEnvironment, String brandName, String modelName, int modelNumber) {
        super(purposeType, operatingEnvironment, brandName);
        this.modelNumber = modelNumber;
        this.modelName = modelName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    // optional method
//    @Override
//    public String toString() {
//        return "Model{" +
//                "purpose type= " + getPurposeType() +
//                ", operating environment= " + getOperatingEnvironment() +
//                ", model brand= " + getBrandName() +
//                ", model name = " + modelName +
//                ", model number= " + modelNumber + "} ";
//    }
}

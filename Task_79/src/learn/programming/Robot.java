package learn.programming;

public class Robot {

    private String purposeType;
    private String operatingEnvironment;

    public Robot(String purposeType, String operatingEnvironment) {
        this.purposeType = purposeType;
        this.operatingEnvironment = operatingEnvironment;
    }

    public String getPurposeType() {
        return purposeType;
    }

    public String getOperatingEnvironment() {
        return operatingEnvironment;
    }
}

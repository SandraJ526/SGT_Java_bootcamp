package learn.programming;

public class Brand extends Robot {

    private String brandName;

    public Brand(String purposeType, String operatingEnvironment, String brandName) {
        super(purposeType, operatingEnvironment);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}

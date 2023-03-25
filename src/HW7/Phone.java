package HW7;

public abstract class Phone{
    private String brand;
    private String phoneNumber;

    public Phone(String brand, String phoneNumber) {
        this.brand = brand;
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

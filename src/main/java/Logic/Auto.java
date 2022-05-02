package Logic;

public class  Auto  {
    private String numberauto;
    private String brand;
    private String passport;

    public Auto() {
    }

    public Auto(String numberauto, String brand, String passport) {
        this.numberauto = numberauto;
        this.brand = brand;
        this.passport = passport;
    }

    public String getNumberauto() {
        return numberauto;
    }

    public void setNumberauto(String numberauto) {
        this.numberauto = numberauto;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}

package interit;

public class vehicle {
    private String brand = "ford";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void sound(){
        System.out.println("tut, tuuut");
    }
}

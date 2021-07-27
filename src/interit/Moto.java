package interit;

public class Moto extends vehicle {
    private String modelName ;
    private String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Moto(String modelName, String color) {

        this.modelName = modelName;
        this.color = color;
    }

    public Moto() {
    }
    public void printMoto() {
        System.out.println("ម៉ូត​"+ modelName + "Color " + color + "Brand " + getBrand());
    }
}

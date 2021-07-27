package interit;

public class car extends vehicle {
    private String modelName = "Ranger";
    public String getModelName() {
        return modelName;
    }
    public void setModelName (String modelName) {
        this.modelName = modelName;
    }
    public void printCar(){
        System.out.println(modelName);
    }
}

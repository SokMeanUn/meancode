package interit;

public class Main {
    public static void main(String[] args) {
        car car1 = new car();
        car1.sound();
        car1.setModelName("Mastang");
        car1.setBrand("toyota");
        System.out.println(car1.getBrand());
        System.out.println(car1.getModelName());
        car car2 = new car();
        car2.setBrand("VIGO");
        car2.setModelName("R1");
        System.out.println(car2.getBrand());
        System.out.println(car2.getModelName());

        Moto moto1 = new Moto("Dream","Black");
        moto1.printMoto();
    }

}

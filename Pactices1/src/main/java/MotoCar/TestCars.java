package MotoCar;

public class TestCars {
    public static void main(String[] args) {
        Cars car1 = new Cars("HONDA","CRV");
        System.out.println(car1.carsNumber);
        Cars car2 = new Cars("TESLA","Y");
        System.out.println(car2.carsNumber);
    }
}

package MotoCar;
public class Cars {
   private String name;
   private String engine;
   public static int carsNumber;

   public Cars(String x, String y) {
      this.name = x;
      this.engine = y;
      carsNumber++;
   }
}

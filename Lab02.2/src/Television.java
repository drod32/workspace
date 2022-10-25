public class Television {

   private String brand;
   private int volume;

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public int getVolume() {
      return volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   public void turnOn() {
      System.out.println("Turning on your " + brand +
              " TV to volume " + volume + "\n");
   }
   public void turnOff() {
      System.out.println(brand +
              " TV Shutting down...goodbye\n");
   }

   @Override
   public String toString() {
      return "Television: " +
              "brand=" + brand +
              ", volume=" + volume;
   }
}

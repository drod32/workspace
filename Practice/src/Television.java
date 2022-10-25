//This is an example of how code should be formatted
public class Television {


   //Fields
   private String brand;
   private int volume;

   public Television(String brand) {
      this.brand = brand;
   }

   // Constructor
   public Television(String brand, int volume) {
      this.brand = brand;
      this.volume = volume;
   }

   //Business Methods
   public void turnOn() {
      boolean isConnected = verifyInternetConnection();
      System.out.println("Turning on your " + brand +
              " TV to volume " + volume + "\n");
   }
   public void turnOff() {
      System.out.println(brand +
              " TV Shutting down...goodbye\n");
   }
   public void changeVolume() {
      System.out.println("You changed the volume of "+ brand +
              " TV to " + volume);
   }


   //Accessor Methods (Getter & Setter)
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
      changeVolume();
   }


   private boolean verifyInternetConnection(){
      return true;
   }


   //ToString
   @Override
   public String toString() {
      return "Television: " +
              "brand=" + brand +
              ", volume=" + volume;
   }
}

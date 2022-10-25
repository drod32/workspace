package com.entertainment;

//This is an example of how code should be formatted
public class Television {


   //Fields
   public static final int MIN_VOLUME = 0;
   public static final int MAX_VOLUME = 100;

   private String brand;
   private int volume;
   private static int instanceCount = 0;
   public boolean isMuted;
   private int oldVolume;
   private DisplayType display = DisplayType.LED;




   // Constructor and Counter
   public Television(){
      instanceCount++;
   }
//   }

   public Television(String brand, int volume, DisplayType display) {
      this();
      this.brand = brand;
      this.volume = volume;
      this.display = display;
   }

//   public com.entertainment.Television(String brand, int volume) {
//      this(brand);
//      setVolume(volume);
//   }



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
   public void mute() {
      //int previousVolume = getVolume();
      if (getIsMuted()){
         setVolume(oldVolume);
         setIsMuted(false);
         System.out.println("TV is unmuted,Volume " + oldVolume);
      }
      else {
         oldVolume = getVolume();
         setVolume(MIN_VOLUME);
         setIsMuted(true);
         System.out.println("volume is muted");
      }
   }





   //Accessor Methods (Getter & Setter)
   public String getBrand() {
      return brand;
   }
   public void setBrand(String brand) {
      if (brand.equals("Sony") ||  brand.equals("LG")  || brand.equals("Toshiba") ||  brand.equals("Samsung") ){
         this.brand = brand;
      }
      else{
         System.out.println("Invalid Brand");
      }
   }
   public int getVolume() {
      return volume;
   }

   public boolean getIsMuted() {
      return isMuted;
   }

   public void setIsMuted(boolean muted) {
      isMuted = muted;
   }

   public DisplayType getDisplay() {
      return display;
   }

   public void setDisplay(DisplayType display) {
      this.display = display;
   }

   public void setVolume(int volume) {
      if ((volume >= MIN_VOLUME ) && (volume <= MAX_VOLUME)){
         this.volume = volume;
         //changeVolume();
      }
      else {
         System.out.println("invalid Volume: " + MIN_VOLUME + " and " + MAX_VOLUME);
      }








   //instance counter
   }
   public static int getInstanceCount() {
      return instanceCount;
   }




   //toString
   private boolean verifyInternetConnection(){
      return true;
   }

   @Override
   public String toString() {
      String muteState = ( getIsMuted() )? "<muted>" : String.valueOf(getVolume());
      return "com.entertainment.Television{" +
              "brand='" + brand + '\'' +
              ", volume=" + volume +
              ", volume=" + muteState +
              '}';
   }
}

public class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        int volume = tv1.getVolume();

        Television tv2 = new Television();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        tv1.turnOn();
        tv2.turnOff();

        System.out.println(tv1.toString() + "\n" );

        System.out.println(tv2);
    }

}



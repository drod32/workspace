public class TelevisionClient2 {

    public static void main(String[] args) {
        Television tv2 = new Television("Toshiba",32);
        Television tv1 = new Television("Sony");


        //System.out.println(tv2);
        tv2.turnOn();

        tv2.setVolume(15);
        tv2.setVolume(25);
        tv2.setVolume(0);

        tv2.turnOff();

        //System.out.println(tv2);

    }

}

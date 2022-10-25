public class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television("Samsung",32);


        Television tv2 = new Television("Sony", 50);


        tv1.turnOn();
        tv2.turnOff();

        System.out.println(tv1.toString() + "\n" );

        System.out.println(tv2);
        System.out.println(tv2);
    }

}



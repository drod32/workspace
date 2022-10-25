package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television("Samsung",32, DisplayType.LCD);


        Television tv2 = new Television("Sony", 50,DisplayType.LED);


        tv1.turnOn();
        tv2.turnOff();

        System.out.println(tv1.toString() + "\n" );

        System.out.println(tv2);
        System.out.println(tv2);
    }

}



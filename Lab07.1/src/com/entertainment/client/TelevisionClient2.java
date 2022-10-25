package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient2 {

    public static void main(String[] args) {
        Television tv2 = new Television("Toshiba",32, DisplayType.LED);
        Television tv1 = new Television("Sony", 15,DisplayType.PLASMA);
        Television tv3 = new Television("Samsung", 45,DisplayType.OLED);


        //System.out.println(tv2);
        tv2.turnOn();
        tv1.turnOn();
        tv3.turnOn();

        tv2.setVolume(101);
        tv2.setVolume(25);
        tv2.setVolume(Television.MIN_VOLUME);
        tv2.setVolume(Television.MAX_VOLUME);;
        tv2.turnOff();


        System.out.println(Television.getInstanceCount());

    }

}

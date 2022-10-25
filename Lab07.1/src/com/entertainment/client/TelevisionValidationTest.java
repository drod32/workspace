package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tvTest = new Television("Sony", 25, DisplayType.CRT );
        Television tv = new Television("LG", 18,DisplayType.LED);

//        TESTING
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
    }
}

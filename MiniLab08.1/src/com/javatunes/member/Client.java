/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.member;

public class Client {

    public static void main(String[] args) {

        Member david = new SubSubMember("David",
                true, 3);
        Member joe = new SubMember("joe",
                true, 2);
        Member eric =

        david.checkPoints();
        joe.checkPoints();
    }
}
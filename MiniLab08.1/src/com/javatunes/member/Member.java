/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.member;

public abstract class Member {

    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void checkPoints() {

        // NOTE: there is a call to super() here! as the first line of code
        // What's the superclass of Member?  Is there a no-arg ctor in that class?
        // System.out.println("Member ctor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.member;

public class SubMember extends Member {

    private boolean membershipStatus;
    private int extraRewardPoints;

    public SubMember(String name, boolean membershipStatus,
                     int extraRewardPoints) {
        super(name);
        this.membershipStatus = membershipStatus;
        this.extraRewardPoints = extraRewardPoints;
    }



    @Override
    public void checkPoints() {
        // NOTE: there is a call to super() here! as the first line of code
        System.out.println( getName()+ "Has an active membership " +
                "and will receive " +
                extraRewardPoints + " bonus points!!");
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public int getExtraRewardPoints() {
        return extraRewardPoints;
    }

    public void setExtraRewardPoints(int extraRewardPoints) {
        this.extraRewardPoints = extraRewardPoints;
    }
}
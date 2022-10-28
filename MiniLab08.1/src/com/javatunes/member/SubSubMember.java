package com.javatunes.member;

public class SubSubMember extends Member {

    private boolean membershipStatus;
    private int extraRewardPoints;

    public SubSubMember(String name, boolean membershipStatus,
                        int extraRewardPoints) {
        super(name);
        this.membershipStatus = membershipStatus;
        this.extraRewardPoints = extraRewardPoints;
    }

    @Override
    public void checkPoints() {
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

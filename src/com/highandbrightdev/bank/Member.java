package com.highandbrightdev.bank;

public class Member {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member[name=" + name + "]";
    }
}

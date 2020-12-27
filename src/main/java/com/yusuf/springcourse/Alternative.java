package com.yusuf.springcourse;

public class Alternative implements Music{

    private Alternative() {

    }

    public static Alternative getAlternative() {
        return new Alternative();
    }

    @Override
    public String getSong() {
        return "Linkin Park - Somewhere I belong";
    }

    public void doMyInit() {
        System.out.println("Get started initialization Alternative Bean");
    }

    public void doMyDestroy() {
        System.out.println("Destroying bean Alternative Bean");
    }
}

package com.test.java;

public class Workstation implements Computer,VMComputer{
    @Override
    public void code() {
        System.out.println("i am coding in a workstation");
        remoteComputer();
    }

    @Override
    public void remoteComputer() {
        System.out.println("Workstation can work with remote computers");
    }
}

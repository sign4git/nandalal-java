package org.example;

public class Laptop {
    String ramMemory;
    String  hardDiskMemory;

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(String hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ramMemory='" + ramMemory + '\'' +
                ", hardDiskMemory='" + hardDiskMemory + '\'' +
                '}';
    }
}

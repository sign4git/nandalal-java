package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    String ramMemory;
    String  hardDiskMemory;

    public Laptop(){
        System.out.println("Laptop object created");
    }

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

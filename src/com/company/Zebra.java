/*
YI WAN 1702079 - PROJECT2
Zebra.java
 */
package com.company;

public class Zebra extends Animal {
    //Constructor for the Zebra class
    Zebra(String name) {
        setName(name);
        setGenus("Equus");
        setSpecies("quagga");
    }

    //Print the Feeding price
    @Override
    public void getFeedingInstruction() {
        System.out.println("Grass 600$");
    }

    @Override
    public void feed() {
    }

    // override the toString method
    public String toString() {
        return this.getName() + " (" + this.getGenus() + " " + this.getSpecies() + ")";
    }

    // override the equals method to return true if the name is equal
    public boolean equals(Object other) {
        //Check Name is same
        return this.getName() == ((Zebra)other).getName();
    }
}

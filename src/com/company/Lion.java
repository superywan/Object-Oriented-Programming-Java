/*
YI WAN 1702079 - PROJECT2
Lion.java
 */
package com.company;

public class Lion extends Animal{
    //Constructor for the Lion class
    Lion(String name) {
        setName(name);
        setGenus("Panthera");
        setSpecies("leo");
    }

    //Print the Feeding price
    @Override
    public void getFeedingInstruction() {
        System.out.println("Meat 4000$");
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
        return this.getName() == ((Lion)other).getName();
    }
}

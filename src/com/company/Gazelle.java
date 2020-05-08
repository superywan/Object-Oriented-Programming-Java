/*
YI WAN 1702079 - PROJECT2
Gazelle.java
 */
package com.company;

public class Gazelle extends Animal {
    //Constructor for the Gazelle class
    Gazelle(String name) {
        setName(name);
        setGenus("Rhim");
        setSpecies("gazelle");
    }

    //Print the Feeding price
    @Override
    public void getFeedingInstruction() {
        System.out.println("Grass 900$");
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
        return this.getName() == ((Gazelle)other).getName();
    }
}

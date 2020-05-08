/*
YI WAN 1702079 - PROJECT2
Crocodile.java
 */
package com.company;

public class Crocodile extends Animal {
    //Constructor for the Crocodile class
    Crocodile(String name) {
        setName(name);
        setGenus("Crocodylus");
        setSpecies("niloticus");
    }

    //Print the Feeding price
    @Override
    public void getFeedingInstruction() {
        System.out.println("Meat 5000$");
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
        return this.getName() == ((Crocodile)other).getName();
    }
}

/*
YI WAN 1702079 - PROJECT2
Zoo.java
 */
package com.company;

public class Zoo {
    private String name;
    private String address;
    private Enclosure[] enclosures;
    private int area;
    private double budget;

    //Constructor for Zoo Class
    Zoo (String name, String address, int area, int budget) {
        this.name = name;
        this.address = address;
        this.area = area;
        this.budget = budget;
        enclosures = new Enclosure[5];
    }

    //Getter for Name
    public String getName() {
        return this.name;
    }

    //Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for Address
    public String getAddress() {
        return address;
    }

    //Setter for Address
    public void setAddress(String address) {
        this.address = address;
    }

    //Getter for Area
    public int getArea() {
        return this.area;
    }

    //Setter for Area
    public void setArea(int area) {
        this.area = area;
    }

    //Getter for Budget
    public double getBudget() {
        return this.budget;
    }

    //Setter for Budget
    public void setBudget(double budget) {
        this.budget = budget;
    }

    //Getter for Enclosures
    public Enclosure[] getEnclosures() {
        return this.enclosures;
    }

    //Setter for Enclosures
    public void setEnclosures(Enclosure[] enclosures) {
        this.enclosures = enclosures;
    }

    //Add Enclosure to the current enclosures array
    public void addEnclosure(Enclosure enclosure) {
        //loop over the enclosures array
        for (int i = 0; i < enclosures.length; i++) {
            //if the index is empty
            if (enclosures[i] == null) {
                this.enclosures[i] = enclosure;
                break;
            }
        }
    }

    //print the Enclosures on the zoo.
    public void getInfo() {
        System.out.println(this.toString());
        System.out.println("Enclosures:");
        for (int i = 0; i < enclosures.length; i++) {
            if (enclosures[i] != null) {
                switch (i) {
                    case 0:
                        System.out.print("\t1. ");
                        enclosures[i].getInfo();
                        break;
                    case 1:
                        System.out.print("\t2. ");
                        enclosures[i].getInfo();
                        break;
                    case 2:
                        System.out.print("\t3. ");
                        enclosures[i].getInfo();
                        break;
                }
            }
        }
    }

    //print the feeding instruction
    public void getFeedingInstructions() {
        System.out.println("How to Feed:");
        for (int i = 0; i < enclosures.length; i++) {
            //check if the array is empty
            if (enclosures[i] != null) {
                //switch statement for the numbered lists
                switch (i) {
                    case 0:
                        System.out.print("\t1. ");
                        enclosures[i].getFeedingInstructions();
                        break;
                    case 1:
                        System.out.print("\t2. ");
                        enclosures[i].getFeedingInstructions();
                        break;
                    case 2:
                        System.out.print("\t3. ");
                        enclosures[i].getFeedingInstructions();
                        break;
                }
            }
        }
    }

    //Feed the animal
    public void feed() {
        double totalFeedingFee = 0;
        double currentEnclosure = 0;
        //sum up the total fee to feed all the animal in zoo
        for (int i = 0; i < enclosures.length; i++) {
            if (enclosures[i] != null) {
                //get the price for each enclosures and add it to total fee
                currentEnclosure = enclosures[i].getFeedingPrice();
                totalFeedingFee += currentEnclosure;
            }
        }
        //if the total fee is higher than the budget, show error.
        if (totalFeedingFee > this.budget) {
            System.out.println("Feeding failed! Out of funds.");
            //if the total fee is lower than the budget, show success.
        } else if (totalFeedingFee <= budget) {
            this.budget -= totalFeedingFee;
            System.out.println("Feeding completed successfully.");
        }
    }

    // override the toString method
    public String toString() {
        return this.getName() +
                "\n==========\n" +
                "Address: " + this.getAddress() +
                "\narea: " + this.getArea() +
                "\n==========";
    }

    // override the equals method to return true if the name and address are equal
    public boolean equals(Object other) {
        //Check name is same
        boolean isNameSame = this.getName() == ((Zoo)other).getName();
        //Check address is same
        boolean isAddressSame = address.equals(((Zoo)other).address);
        return isNameSame && isAddressSame;
    }

}

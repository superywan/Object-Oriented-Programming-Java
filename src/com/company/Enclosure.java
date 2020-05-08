/*
YI WAN 1702079 - PROJECT2
Enclosure.java
 */
package com.company;

public class Enclosure {
    private String biome;
    private Animal[] animals;

    //Constructor for Enclosure Class
    Enclosure(String biome) {
        this.biome = biome;
        this.animals = new Animal[5];
    }

    //Getter for Biome
    public String getBiome() {
        return this.biome;
    }

    //Setter for Biome
    public void setBiome(String biome) {
        this.biome = biome;
    }

    //Getter for Animals
    public Animal[] getAnimals() {
        return this.animals;
    }

    //Setter for Animals
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    //Add animal to the Animals array
    public void addAnimal(Animal animal) {
        //If the animal is Crocodile, check the current Enclosure's biome is river or not.
        if (animal instanceof Crocodile) {
            if (!((this.getBiome().toLowerCase()).equals("river"))) {
                //If it's not river biome, print the error.
                System.out.println("Error! " + animal.getName() +
                        " cannot live in the Savanna. addAnimal failed.");
                return;
            }
            //If the animal is Zebra, check there's Crocodile.
        } else if (animal instanceof Zebra) {
            for (int a = 0; a < animals.length; a++) {
                if (animals[a] instanceof Crocodile) {
                    //Print the error.
                    System.out.println("Error! " + animal.getName() + " cannot live with " + animals[a].getName() +
                            ", as they are enemies. addAnimal failed.");
                    return;
                }
            }
        }
        //After checking the errors, add animal to the enclosure.
        for (int b = 0; b < animals.length; b++) {
            if (animals[b] == null) {
                this.animals[b] = animal;
                break;
            }
        }
    }

    //Print this enclosure's animals instruction
    public void getInfo() {
        System.out.println(this.getBiome() + ":");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                //switch statement for the lists
                switch (i) {
                    case 0:
                        System.out.print("a) ");
                        System.out.println(animals[i].toString());
                        break;
                    case 1:
                        System.out.print("b) ");
                        System.out.println(animals[i].toString());
                        break;
                    case 2:
                        System.out.print("c) ");
                        System.out.println(animals[i].toString());
                        break;
                }
            }
        }
    }

    //Print the feeding instruction
    public void getFeedingInstructions() {
        System.out.println(this.getBiome() + ":");
        for (int i =0; i < animals.length; i++) {
            if (animals[i] != null) {
                //switch statement for the lists
                switch (i) {
                    case 0:
                        System.out.print("a) ");
                        animals[i].getFeedingInstruction();
                        break;
                    case 1:
                        System.out.print("b) ");
                        animals[i].getFeedingInstruction();
                        break;
                    case 2:
                        System.out.print("c) ");
                        animals[i].getFeedingInstruction();
                        break;
                }
            }
        }
    }

    //Get the current enclosures total feeding price.
    public double getFeedingPrice() {
        double totalFeedingPrice = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Crocodile) {
                totalFeedingPrice += 5000;
            } else if (animals[i] instanceof Lion) {
                totalFeedingPrice += 4000;
            } else if (animals[i] instanceof Gazelle) {
                totalFeedingPrice += 900;
            } else if (animals[i] instanceof Zebra) {
                totalFeedingPrice += 600;
            }
        }
        return totalFeedingPrice;
    }

    // override the toString method
    public String toString() {
        return "Biome: " + this.biome;
    }

    // override the equals method to return true if the name and address are equal
    public boolean equals(Object other) {
        //Check biome is same
        boolean isBiomeSame = this.getBiome() == ((Enclosure)other).getBiome();
        //Check animals is same
        boolean isAnimalsSame = this.getAnimals() == ((Enclosure)other).getAnimals();
        return isBiomeSame && isAnimalsSame;
    }
}

/*
YI WAN 1702079 - PROJECT2
Animal.java
 */
package com.company;

public class Animal implements Feedable{
    private String name;
    private String genus;
    private String species;
    private Zoo currentZoo;
    protected Animal enemy;
    protected String prefferedBiome;

    //Getter for Name
    public String getName() {
        return this.name;
    }

    //Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for Genus
    public String getGenus() {
        return this.genus;
    }

    //Setter for Genus
    public void setGenus(String genus) {
        this.genus = genus;
    }

    //Getter for Species
    public String getSpecies() {
        return this.species;
    }

    //Setter for Species
    public void setSpecies(String species) {
        this.species = species;
    }

    //Getter for CurrentZoo
    public Zoo getCurrentZoo() {
        return this.currentZoo;
    }

    //Setter for CurrentZoo
    public void setCurrentZoo(Zoo currentZoo) {
        this.currentZoo = currentZoo;
    }

    //Getter for Enemy
    public Animal getEnemy() {
        return this.enemy;
    }

    //Setter for Enemy
    public void setEnemy(Animal enemy) {
        this.enemy = enemy;
    }

    //Getter for PrefferedBiome
    public String getPrefferedBiome() {
        return this.prefferedBiome;
    }

    //Setter for PrefferedBiome
    public void setPrefferedBiome(String prefferedBiome) {
        this.prefferedBiome = prefferedBiome;
    }

    @Override
    public void getFeedingInstruction(){
    }

    @Override
    public void feed(){
    }

    // override the toString method
    public String toString() {
        return this.name + " (" + this.genus + " " + this.species + ")";
    }

    // override the equals method to return true if the name and address are equal
    public boolean equals(Object other) {
        //Check Name is same
        boolean isNameSame = this.getName() == ((Animal)other).getName();
        //Check Species is same
        boolean isSpeciesSame = this.getSpecies() == ((Animal)other).getSpecies();
        return isNameSame && isSpeciesSame;
    }
}
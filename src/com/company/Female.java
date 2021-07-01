package com.company;

import java.util.ArrayList;

public class Female implements Human{
    ArrayList<Child> children = new ArrayList<>();
    boolean genderFemale = true;
    boolean isDead = false;

    int motherId = 0;
    int fatherId = 0;
    int age = 10;
    int count = 0;
    final String gender = "Female";

    Female(int Age){
        age = Age;
    }

    public Female() {

    }

    public void addChild(Child c){
        children.add(c);
    }

    @Override
    public int getAge() {return age;}

    @Override
    public void setAge(int Age) {
        age = Age;
    }

    @Override
    public boolean getGender() {
        return false;
    }

    @Override
    public boolean setGender() {
        return false;
    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void dies() {
        isDead = true;
    }

    @Override
    public void setId(int id) {
        count = id;
    }
}

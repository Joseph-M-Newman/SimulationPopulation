package com.company;

import java.util.ArrayList;

public class Male implements Human{
    ArrayList<Child> children = new ArrayList<>();
    boolean genderMale = true;
    boolean isDead = false;

    int age = 10;
    int count = 0;
    final String gender = "Male";

    Male(int Age){
        age = Age;
    }

    public Male() {

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
        return genderMale;
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

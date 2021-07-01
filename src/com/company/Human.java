package com.company;

import java.util.ArrayList;

public interface Human {
    ArrayList<Child> children = new ArrayList<Child>();
    boolean getGender();

    boolean setGender();

    boolean isDead();

    void dies();

    void setId(int id);

    int getAge();

    void setAge(int Age);
}

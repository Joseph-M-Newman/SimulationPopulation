package com.company;

public class Child implements Human{
    boolean genderMale = false;
    boolean genderFemale = false;
    boolean isDead = false;

    int motherId = 0;
    int fatherId = 0;
    int age = 10;
    int count = 0;
    String gender = "";

    Child(Male m, Female f, String Gender){
        fatherId = m.count;
        motherId = f.count;
        gender = Gender;
    }


    @Override
    public boolean getGender() {
        if(genderFemale == true){
            return genderFemale;
        }
        if(genderMale == true){
            return genderMale;
        }
        return false;
    }

    @Override
    public boolean setGender() {
        return false;
    }

    public boolean setgender(String gender) {
        if(gender == "Male"){
            genderMale = true;
            return genderMale;
        }
        if(gender == "Female"){
            genderFemale = true;
            return genderFemale;
        }
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

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int Age) {
        age = Age;
    }
}

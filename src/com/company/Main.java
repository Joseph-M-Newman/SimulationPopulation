package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Male> males = new ArrayList<>();
    static ArrayList<Female> females = new ArrayList<>();
    static ArrayList<Child> children = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {


        //Populate the area ( a set 100 amount for women and men );
        for(int i = 0; i < 100; i++){
            Random random = new Random();
            Random random1 = new Random();
            int maleAge = random.nextInt(50-7);
            int femaleAge = random1.nextInt(50-7);

            males.add(new Male(maleAge));
            males.get(i).setId(males.size());

            females.add(new Female(femaleAge));
            females.get(i).setId(females.size());

            System.out.println("Male: " + males.get(i).count);
        }

        //system for making chances;
        //365 days within the year our simulation will be sped up but have time pauses in between each day (3 seconds);
        for(int y = 0; y  < 100;y++){
            for(int t = 0; t <365; t++){
                Random random = new Random();
                Random random1 = new Random();
                Male m;
                Female f;
                //get random male and female from Array
                int randomMale = random.nextInt(males.size());
                int randomFemale = random1.nextInt(females.size());
                if(randomMale > males.size()){
                    m = males.get(males.size()-1);
                }else {
                    System.out.println(randomMale);
                    m = males.get(randomMale);
                }
                if(randomFemale > females.size()){
                    f = females.get(females.size()-1);
                }else {
                    f = females.get(randomFemale);
                }

                if(canMate(m,f)){
                    if(hasMated(m,f)){
                        Random r2 = new Random();
                        int boygirl = r2.nextInt(1);
                        if(boygirl == 1){
                            females.add(new Female());
                        }

                    } else{
                        System.out.println("Mating failed: " + m.getAge() + " " + f.getAge());
                    }
                }

            }
            for(int p = 0; p < males.size();p++){
                Random chanceofDeath = new Random();
                int rand = chanceofDeath.nextInt(102-80);
                males.get(p).age++;
                System.out.println("Male Age: "+males.get(p).age);
                if(males.get(p).age == 105){
                    males.remove(p);
                }
                if(males.get(p).age == rand){
                    males.remove(p);
                }
            }
            //bug fix on first run (takes females size(), doesnt update when the next iteration of the loop begins;
            for(int g = 0; g < females.size(); g++){
                Random chanceofDeath = new Random();
                int rand = chanceofDeath.nextInt(102-80);
                females.get(g).age++;
                System.out.println("Female Age: "+females.get(g).age);
                if(females.get(g).age == 105){
                    females.remove(g);
                }
                if(females.get(g).age == rand){
                    females.remove(g);
                }
            }
        }



    }
    //check if age is above mating threshhold
    static boolean canMate(Male m, Female f){
            if(m.age >= 18 && f.age >= 18){
                if(f.age <= 65){
                    return true;
                }
            }
        return false;
        }
    //run RNG to see if mate has been successful
    static boolean hasMated(Male m, Female f){
        String gender;
        Random mateChance = new Random();
        Random fif = new Random();
        int fd = fif.nextInt(1);
        if(fd == 1){
            gender = "Female" ;
        } else{
            gender = "Male";
        }
        int mate = mateChance.nextInt(100);
        if(mate >= 85){
            Child c = new Child(m,f,gender);
            m.addChild(c);
            f.addChild(c);
            System.out.println("Parents Id:\nMother Id: " + c.motherId + "\nFather Id: " + c.fatherId );
        }

        return false;
    }

    public boolean maleAdultChange(){
        int change = 0;
        for(int i = 0; i < children.size(); i++){
            if(children.get(i).getAge() >= 18){
                if(children.get(i).genderMale){
                    males.add(new Male(children.get(i).getAge()));
                    children.remove(i);
                }
                change = 1;
            }
        }

        if(change == 1){
            return true;
        }else {
            return false;
        }
    }


}

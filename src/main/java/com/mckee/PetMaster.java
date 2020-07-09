package com.mckee;

import com.earlhaig.*;

public class PetMaster {

    public static void main(String[] args){

        String petReaction;     

        Pet myPet = new Pet(1, 3, 3, "Blue");
        System.out.println(myPet.getColor());
        System.out.println(myPet.age);
        System.out.println(myPet.weight);
        System.out.println(myPet.getHeight());
        String testString = "abcd";

        myPet.eat();            

        petReaction = myPet.talk("Tweet!! Tweet!!"); 
        
        System.out.println(petReaction);

        Dog butters = new Dog();
        System.out.println(butters.getColor());

        myPet.sleep(); 
    }
}
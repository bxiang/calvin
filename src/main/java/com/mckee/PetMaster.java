package com.mckee;

import com.earlhaig.Pet;


public class PetMaster {

    public static void main(String[] args){

        String petReaction;     

        Pet myPet = new Pet();

        myPet.eat();            

        petReaction = myPet.talk("Tweet!! Tweet!!"); 
        
        System.out.println(petReaction);
        System.out.println(args[0]);

        myPet.sleep(); 
    }
}
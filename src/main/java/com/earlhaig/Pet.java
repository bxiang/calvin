package com.earlhaig;

public class Pet {

    public int age;
    public float weight;
    private float height;
    private String color;

    public Pet(){

    }




    public Pet(int age, float w, float h, String color){
        this.age = age;
        weight = w;
        height = h;
        this.color = color;
    }

    public void sleep() {
        System.out.println(
                "Good night, see you tomorrow!");
    }

    public void eat() {
        System.out.println(
                "I’m so hungry, let me have a snack like nachos!");
    }

    public String talk(String aWord) {
        String petResponse = "OK!! OK!! " + aWord;
        return petResponse;
    }

    public String getColor(){
        return color;

    }

    public float getHeight(){
        return height;
    }
}


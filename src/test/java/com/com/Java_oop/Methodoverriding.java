package com.com.Java_oop;

import java.util.ArrayList;

public class Methodoverriding {

    public   void move() {
        System.out.println("Animals can move111111");

    }

    public  void read(){
System.out.println("Plase read me!!!!");
    }
}

class Dog extends Methodoverriding {

   // Methodoverriding obj1=new Methodoverriding();

    public   void move() {
        System.out.println("Dogs can walk and run");

super.read();
super.move();
    }

    public void su(){

        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        for (Integer num: arrayList){

            System.out.println(num);
        }
    }

}

 class TestDog extends Dog{

    public static void main(String[] args) {
//        Methodoverriding a = new Methodoverriding();   // Animal reference and object
    // Methodoverriding b = new Dog();   // Animal reference but Dog object
        Dog b = new Dog();
        b.move();// runs the method in Animal class
      b.su();
    }
}

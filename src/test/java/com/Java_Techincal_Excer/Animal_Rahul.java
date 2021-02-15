package com.Java_Techincal_Excer;

// Significans of Super keyword

 class Animal_Rahul {

    String color="White";
}

class  Dog extends Animal_Rahul{


     Dog (){

         super();
     }

     String color="Black";

     void printColor(){

         System.out.println(color);  //prints color of dog class

         System.out.print(super.color);  //prints color of Animal class


     }
}

class TestSuper1{

     public static void main(String[] args){

         Dog d=new Dog();
         d.printColor();
     }
}

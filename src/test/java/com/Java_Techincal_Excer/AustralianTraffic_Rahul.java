package com.Java_Techincal_Excer;


public class AustralianTraffic_Rahul implements CentrialTrafic_Rahul,Interface_Rahul1 {

    public static void main(String[] args){

        CentrialTrafic_Rahul traffic=new AustralianTraffic_Rahul();

        traffic.FlashYello();
        traffic.greenGo();

        traffic.redStop();

        Interface_Rahul1 law=new AustralianTraffic_Rahul();

        law.Law();


/*
        AustralianTraffic_Rahul traffic=new AustralianTraffic_Rahul();

        traffic.FlashYello();
        traffic.greenGo();

        traffic.redStop();

        traffic.Run();



 */



    }



    @Override
    public void greenGo() {
        System.out.println("greenGo implementation");
    }

    @Override
    public void redStop() {
        System.out.println("redStop implementation");

    }

    @Override
    public void FlashYello() {
        System.out.println("FlashYello implementation");

    }


    public void Run(){
        System.out.println(" I run everyday");
    }

    @Override
    public void Law() {

        System.out.println("Please obey the law");

    }
}

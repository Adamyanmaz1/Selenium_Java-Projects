package com.CoreJava;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSpliterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc@gmail.com");
        list.add("xyz@gmail.com");
        list.add("user@gmail.com");
        list.add("mno@gmail.com");
        list.add("random@gmail.com");
System.out.println("List of emails: ");
        for (String str:list){
            System.out.println(str);
        }

        Spliterator<String> emails = list.spliterator();

        System.out.println("List of Emails: ");
        emails.forEachRemaining(System.out::println);
    }
}

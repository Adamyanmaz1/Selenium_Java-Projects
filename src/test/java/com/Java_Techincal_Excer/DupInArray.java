package com.Java_Techincal_Excer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupInArray {

    public static void main(String[] args){

        String[] names={"Java","Javascript","ruby","c","Java","ruby"};

        int k=0;

        for(int i=0; i<names.length;i++){
            for (int j=i+1; j<names.length; j++){
                if (names[i].equals(names[j])){
                    System.out.println("duplicate element is ::"+names[i]);
                    k++;
                }
            }
        }

        System.out.println(k);
System.out.println("********************");
        //2. Using Hashset: Java collection: it stores unique values

        Set<String> storemap=new HashSet<String>();

        for (String name: names){
            if (storemap.add(name)==false){
                System.out.println("dulicate element is ::::: " +name);
            }
        }

        for (String name: names){
           if (!storemap.add(name)){
               System.out.println("dulicate element is ::::: " +name);
            }
        }

        System.out.println("********************");

        Map<String ,Integer> store=new HashMap<String, Integer>();

        for (String name:names){

            Integer count=store.get(name);
            if (count==null){
                store.put(name,1);

            }

            else {
                store.put(name,++count);
            }
        }

        //get the values from the hashmap

        Set<Map.Entry<String,Integer>> entrySet=store.entrySet();
        for (Map.Entry<String, Integer> entry: entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duploicate element is :" + entry.getKey());
            }

        }

    }
}

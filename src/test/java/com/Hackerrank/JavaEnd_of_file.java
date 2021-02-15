package com.Hackerrank;

import java.util.Scanner;

public class JavaEnd_of_file {

    public static void main(String[] args){

       Scanner scanner=new Scanner(System.in);

       int line_number=1;

       while(scanner.hasNext()){

           System.out.println(line_number+"" +scanner.nextLine());

           line_number++;
       }

       scanner.close();

    }
}

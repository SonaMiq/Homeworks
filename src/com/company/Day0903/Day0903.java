package com.company.Day0903;

import java.util.Scanner;

public class Day0903 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        while (true){
          try{
              number= Integer.parseInt(scanner.next());
              break;
          }
          catch (NumberFormatException e){
              System.out.println("Please insert only numbers");
          }
        }
    }
}

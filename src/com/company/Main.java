package com.company;
import java.util.Scanner;

public class Main {
    public static int x, y;

    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Write first number: ");
      double x = in.nextDouble();

      System.out.print("Write second number: ");
      double y = in.nextDouble();

        System.out.print("Write a opperation (+, -): ");
        char znak = in.next().charAt(0);

      if (znak == '+'){
          sum(x, y);
      }
      else if (znak == '-'){
          minus(x, y);
      }
      else{
          System.out.println("Choose right opperation or write corect numbers");
      }
    }
    static void sum(double x, double y){
        double z = x + y;
        System.out.println(z);
    }
    static void minus(double x, double y){
        double z = x - y;
        System.out.println(z);
    }



    }



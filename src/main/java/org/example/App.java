package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your weight in pounds? ");
        double weightp = sc.nextInt();
        System.out.print("What is your height in inches? ");
        double heightp = sc.nextInt();
        double BMI = ((weightp / (heightp * heightp)) * 703);
        System.out.println("Your BMI is "+BMI);
        if(BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range");
        }
        else if (BMI < 18.5 ){
            System.out.println("You are underweight. You should see your doctor");
        }
        else{
            System.out.println("You are overweight. You should see your doctor");
        }
    }
}


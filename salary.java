/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author User
 */
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter working day : ");
        int work_day = sc.nextInt();
        System.out.print("Enter absent : ");
        int absent_day = sc.nextInt();
        System.out.print("Enter your weight : ");
        double weight = sc.nextDouble();
        double salary=0;
        System.out.println("Hi! "+name);
        if (age >= 21 && age <= 30){
            salary = (work_day * 300) - (absent_day * 50);
        }else if(age >= 31 && age <= 40){
            salary = (work_day * 500) - (absent_day * 50);
        }else if(age >= 41 && age <= 50){
            salary = (work_day * 1000) - (absent_day * 25);
        }else if(age >= 51 && age <= 60){
            salary = (work_day * 3000);
        }
        System.out.println("Your salary : "+salary);
        if (weight >= 10 && weight <= 60){
            salary += 5000;
            System.out.println("Your salary and bonus : "+salary);
        }else if (weight >= 61 && weight <= 90){
            salary += 5000-((weight-60)*10);
            System.out.println("Your salary and bonus : "+salary);
        }else{
            System.out.println("NO bonus");
        }
    }   
}

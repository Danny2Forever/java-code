package javaapplication1;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your money : ");
        double money = sc.nextDouble();
        System.out.print("Enter type (A B C or X in uppercase): ");
        char type = sc.next().charAt(0);
        switch (type) {
            case 'A':
                System.out.println("Total money : "+(money + money*0.015));
                break;
            case 'B':
                System.out.println("Total money : "+(money + money*0.02));
                break;
            case 'C':
                System.out.println("Total money : "+(money + money*0.015));
                break;
            case 'X':
                System.out.println("Total money : "+(money + money*0.05));
                break;
        }
        
    }
}

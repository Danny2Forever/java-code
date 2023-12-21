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
public class computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 375.99;
        System.out.print("Enter monitor size (38 or 43): ");
        int monitor = sc.nextInt();
        System.out.print("Do you want DVD/CD writer? 1 forYes / 0 forNo : ");
        int dvd = sc.nextInt();
        System.out.print("Do you want Printer? 1 forYes / 0 forNo : ");
        int printer = sc.nextInt();
        System.out.println("=============Your order=============");
        System.out.println("* Computer >>> 375.99$");
        switch (monitor){
            case 38:
               price += 75.99;
               System.out.println("* 38'Monitor >>> 75.99$");
            case 43:
               price += 99.99;
               System.out.println("* 43'Monitor >>> 99.99$");
        }
        if (dvd == 1){
            price += 65.99;
            System.out.println("* DVD/CD writer >>> 65.99$");
        }
        if (printer == 1){
            price += 125.00;
            System.out.println("* Printer >>> 125.00");
        }
        System.out.println("=============Total >>>> "+price+"$ =============");
    }
}

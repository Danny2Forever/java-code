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
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd = 0 , even = 0;
        while (num != -1){
            if (num%2==0){
                even += 1;
            }else{
                odd += 1;
            }
            num = sc.nextInt();
        }
        System.out.println("Odd numbers : "+odd+" Even numbers : "+even);
    }
}

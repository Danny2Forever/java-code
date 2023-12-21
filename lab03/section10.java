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
public class section1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            if ((i+1)%5 == 0){
                System.out.print("/");
            }else{
                System.out.print("|");
            }
        }
    }
}

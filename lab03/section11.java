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
public class section11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1, num = sc.nextInt();
        for(int i=0; i<num; i++){
            if (count%5 == 0){
                System.out.print("|");
                System.out.println("");
            }else{
                System.out.print("|");
            }
            count++;
        }
    }
}

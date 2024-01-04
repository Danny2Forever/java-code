/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        double num1 = topN;
        double num2 = btmN;
        return ""+num1/num2;
    }
    public void addFraction(Fraction f){
        if (f.btmN==btmN){
            topN += f.topN;
        }else{
            topN = topN*f.btmN + f.topN*btmN;
            btmN *= f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        return ((topN==x.topN) && (btmN==x.btmN));
    }
    
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public void LowestTermFrac(){
        int gcd = gcd(topN, btmN);
        topN /= gcd;
        btmN /= gcd;
    }
}

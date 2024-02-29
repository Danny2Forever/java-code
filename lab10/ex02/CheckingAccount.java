/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author User
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    @Override
    public String toString(){
        return "The "+name+" account has "+balance+" baht and "+credit+" credits.";
    }
    @Override
    public void withdraw(double a){
        if (balance - a >= 0){
            balance -= a;
            System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
        }else{
            if ((balance - a) + credit >= 0){
                balance -= a;
                credit -= a - balance;
                System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }else{
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        double num = Double.valueOf(a);
        if (balance - num >= 0){
            balance -= num;
            System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
        }else{
            if ((balance - num) + credit >= 0){
                balance -= num;
                credit -= num - balance;
                System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }else{
                System.out.println("Not enough money!");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;
import java.util.*;
/**
 *
 * @author User
 */
public class Customer{
//    private CheckingAccount acct;
    private String firstName;
    private String lastName;
    private ArrayList acct;
    public Customer(){
        firstName = "";
        lastName = "";
    }
    public Customer(String firstName, String lastName){
        acct = new ArrayList();
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public CheckingAccount getAcct(){
//        return acct;
//    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
//    public void setAcct(CheckingAccount acct){
//       this.acct = acct;
//    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public boolean equals(Customer c){
        if((this.firstName.equals(c.firstName)) & (this.lastName.equals(c.lastName))){
            return true;
        }else{
            return false;
        }
    }
    public Account getAccount(int index){
        return (Account)acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    @Override
    public String toString(){
//        if (acct == null){
//            return firstName+" "+lastName+" doesn’t have account.";
//        }else{
//            return "The "+firstName+" account has "+this.getAcct().getBalance()+" baht and "+this.getAcct().getCredit()+"  credits.";
//        }
        return firstName+" "+lastName+" "+getNumOfAccount();
    }
}

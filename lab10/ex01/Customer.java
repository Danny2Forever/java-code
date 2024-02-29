/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author User
 */
public class Customer{
    private CheckingAccount acct;
    private String firstName;
    private String lastName;
    public Customer(){
        acct = null;
        firstName = "";
        lastName = "";
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
       this.acct = acct;
    }
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
    @Override
    public String toString(){
        if (acct == null){
            return firstName+" "+lastName+" doesn’t have account.";
        }else{
            return "The "+firstName+" account has "+this.getAcct().getBalance()+" baht and "+this.getAcct().getCredit()+"  credits.";
        }
    }
}

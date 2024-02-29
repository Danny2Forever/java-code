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
//    private CheckingAccount acct;
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    public Customer(){
        firstName = "";
        lastName = "";
        acct = new Account[5];
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
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
        return acct[index];
    }
    public void addAccount(Account acct){
        for (int i=0; i < this.acct.length; i++){
            if (this.acct[i] == null){
                this.acct[i] = acct;
                numOfAccount++;
                break;
            }
        }
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    @Override
    public String toString(){
//        if (acct == null){
//            return firstName+" "+lastName+" doesn’t have account.";
//        }else{
//            return "The "+firstName+" account has "+this.getAcct().getBalance()+" baht and "+this.getAcct().getCredit()+"  credits.";
//        }
        return firstName+" "+lastName+" "+numOfAccount;
    }
}

package Task1;

public class AccountBalance {
   private int AccNumber;
  private  String Name;
    private float initialBalance;

    AccountBalance(int accNum,String name,float iniBal){
            AccNumber=accNum;
            Name=name;
            initialBalance=iniBal;
    }
    AccountBalance(int accNumber,String AccountName){
        AccNumber=accNumber;
        Name=AccountName;
        initialBalance=0;
    }
    void display(){
        System.out.println("Account Name: " +Name+"Account Number: " +AccNumber+ "Balance: " +initialBalance);
    }
    public static void main (String[]args){
        AccountBalance acc1= new AccountBalance(201,"Syed Kamran Ahmed",7000);
        AccountBalance acc2= new AccountBalance(119,"Ahmed");
        acc1.display();
        acc2.display();
    }



}

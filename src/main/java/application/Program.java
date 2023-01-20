package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        BusinessAccount bcc1 = new BusinessAccount(); /*ClasseBusinessAccount recebe

        //upcasting                                                  todos os métodos da ClasseAccount*/
        Account acc1 = bcc1;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.print("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.print("Update!");
        }


    }
}

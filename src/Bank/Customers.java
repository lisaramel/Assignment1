package Bank;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-01
 * Time: 13:49
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Customers extends Person implements IAccounts, ILoans{

   private Customers(String firstName, String lastName, String socialSecurityNr){
       super(firstName, lastName, socialSecurityNr);
   }


    @Override
    public void Accounts(double interestRate, double accountBalance) {

    }

    @Override
    public void Loans(double interestRate, double loanAmount) {

    }
}

package Bank;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-01
 * Time: 13:50
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Employees extends Person implements IAccounts, ILoans{

    private double salary;

    private Employees(String firstName, String lastName, String socialSecurityNr, double salary){
        super(firstName, lastName, socialSecurityNr);
        this.salary = salary;
    }


    @Override
    public void Accounts(double interestRate, double accountBalance) {

    }

    @Override
    public void Loans(double interestRate, double loanAmount) {

    }


}

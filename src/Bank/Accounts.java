package Bank;

import java.time.LocalDate;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-01
 * Time: 13:52
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Accounts {

    private double interestRate;
    private double accountBalance;
    private Customers customer;
    private Employees employed;
    private LocalDate dateCreated;


    private Accounts(double interestRate, double accountBalance, LocalDate dateCreated) {

        this.interestRate = interestRate;
        this.accountBalance = accountBalance;
    }


    protected void dateCreated(){
        System.out.println(dateCreated.now());
    }


}
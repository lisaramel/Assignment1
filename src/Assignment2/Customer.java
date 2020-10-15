package Assignment2;

import java.util.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-08
 * Time: 15:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Customer {

    protected String name;
    protected String securityNumber;
    protected String memberSince;

    protected Customer(String securityNumber, String name, String memberSince){
        this.name = name;
        this.securityNumber = securityNumber;
        this.memberSince = memberSince;
    }

    public String getSecurityNumber(){
        return securityNumber;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        HandleCustomers hc = new HandleCustomers();

        Scanner scan = new Scanner(System.in);

        String inFilePath = "src/Assignment2/customers.txt";
        String outFilePath = "src/Assignment2/active.customer.txt";

        List <Customer> allCustomers = hc.customersFromFileToList(inFilePath);

        System.out.println("Ange namn eller personnummer på medlemmen: ");
        String input = scan.nextLine();

        List <Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, input);

        hc.writeToFileIfCustomer(outFilePath, isCustomerNow);

        }
}
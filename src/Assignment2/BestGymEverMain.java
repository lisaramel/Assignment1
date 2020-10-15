package Assignment2;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-15
 * Time: 12:24
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class BestGymEverMain {
    public static void main(String[] args) {

        HandleCustomers hc = new HandleCustomers();

        Scanner scan = new Scanner(System.in);

        String inFilePath = "src/Assignment2/customers.txt";
        String outFilePath = "src/Assignment2/active.customer.txt";

        List<Customer> allCustomers = hc.customersFromFileToList(inFilePath);

        System.out.println("Ange namn eller personnummer på medlemmen: ");
        String input = scan.nextLine();

        List <Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, input);

        hc.writeToFileIfCustomer(outFilePath, isCustomerNow);

    }
}

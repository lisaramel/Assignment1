package Assignment2;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-13
 * Time: 15:44
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class HandleCustomersTest {

    HandleCustomers hc = new HandleCustomers();

    /*
    @Test
    public void readFromFileToListTest(){

        List<Customer> customers = HandleCustomers.customersFromFileToList("Test/Assignment2/test.read.txt");

        assertTrue(customers.size() == 2);
        assertFalse(customers.size() == 3);
    }

     */

    @Test
    public void customersFromFileToListTest(){

        List <Customer> allCustomers = hc.customersFromFileToList("Test/Assignment2/test.read.txt");

        assertTrue(allCustomers.size() == 2);
        assertFalse(allCustomers.size() == 3);

    }

    @Test
    public void isCustomerNowTest(){

        List <Customer> allCustomers = hc.customersFromFileToList("Test/Assignment2/test.read.txt");

        String input = "Anna Andersson";

        List<Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, input);

        assertTrue(isCustomerNow.size() == 1);
        assertFalse(isCustomerNow.size() == 2);

    }

    @Test
    public void writeToFileIfCustomer(){

        String input = "Anna Andersson";

     List <Customer> allCustomers = hc.customersFromFileToList("Test/Assignment2/test.read.txt");
     List<Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, input);

     hc.writeToFileIfCustomer("Test/Assignment2/test.write.txt", isCustomerNow);

     int countLines = 0;
     try (BufferedReader buffIn = new BufferedReader(new FileReader("Test/Assignment2/test.write.txt"))) {
         while(buffIn.readLine() != null){
             countLines++;
         }
     }
     catch(Exception e){
         e.printStackTrace();
         System.exit(0);
     }

     assertTrue(countLines == 1);
     assertFalse(countLines == 0);

    }






}

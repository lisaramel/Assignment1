package Assignment2;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
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

    String anna = "Anna Andersson";
    String per = "Per Persson";

    String writeFile = "Test/Assignment2/test.write.txt";
    String readFile = "Test/Assignment2/test.read.txt";
    List<Customer> allCustomers = hc.customersFromFileToList(readFile);

    @Test
    public void customersFromFileToListTest() {

        allCustomers = hc.customersFromFileToList(readFile);

        assertTrue(allCustomers.size() == 2);
        assertFalse(allCustomers.size() == 3);

    }

    @Test
    public void isCustomerNowTest() {

        allCustomers = hc.customersFromFileToList(readFile);

        List<Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, anna);
        List<Customer> isCustomerNow2 = hc.checkIfCustomerNow(allCustomers, per);

        assertTrue(isCustomerNow.size() == 1);
        assertFalse(isCustomerNow.size() == 2);

        assertTrue(isCustomerNow2.size() == 0);
        assertFalse(isCustomerNow.size() == 2);

    }

    @Test
    public int countLinesInFileTest(String writeFile) {

        int countLines = 0;
        try (BufferedReader buffIn = new BufferedReader(new FileReader(writeFile))) {
            while (buffIn.readLine() != null) {
                countLines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return countLines;
    }

    @Test
    public void writeToFileIfCustomerTest() {

        List<Customer> isCustomerNow = hc.checkIfCustomerNow(allCustomers, anna);

        int beforeNewCustomerAdded = countLinesInFileTest(writeFile);
        hc.writeToFileIfCustomer(writeFile, isCustomerNow);
        int afterNewCustomerAdded = countLinesInFileTest(writeFile);

        assertTrue(beforeNewCustomerAdded < afterNewCustomerAdded);
        assertFalse(beforeNewCustomerAdded > afterNewCustomerAdded);

    }
}

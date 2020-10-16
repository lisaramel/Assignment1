package Assignment2;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-13
 * Time: 13:52
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class HandleCustomers {

    protected List<Customer> customersFromFileToList(String readFile) {
        String firstRow;
        String secondRow;
        Path pathInName;
        List<Customer> allCustomers = new ArrayList<>();

        String[] customerFirstLine;
        String[] customerSecondLine = new String[0];
        pathInName = Paths.get(readFile);

        try (Scanner scan = new Scanner(pathInName)) {

            while (scan.hasNext()) {
                firstRow = scan.nextLine();
                customerFirstLine = firstRow.split(",");
                if (scan.hasNext()) {
                    secondRow = scan.nextLine();
                    customerSecondLine = secondRow.split(",");
                }
                Customer c = new Customer(customerFirstLine[0].trim(), customerFirstLine[1].trim(), customerSecondLine[0].trim());
                allCustomers.add(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas.");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Ett fel inträffade när filen lästes in.");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Ett fel inträffade.");
            e.printStackTrace();
            System.exit(0);
        }
        return allCustomers;
    }

    protected List<Customer> checkIfCustomerNow(List<Customer> allCustomers, String input) {

        List<Customer> isCustomerNow = new ArrayList<>();

        boolean foundCustomer = false;
        for (Customer c : allCustomers) {
            if (c.getName().equalsIgnoreCase(input) || c.getSocialSecurityNumber().equalsIgnoreCase(input)) {

                LocalDate dateToday = LocalDate.now();
                LocalDate inputDate = LocalDate.parse(c.getMemberSince());
                Period p = Period.between(inputDate, dateToday);

                if (p.getYears() < 1) {
                    System.out.println(c.getName() + " är medlem på Best Gym Ever. Välkommen!");
                    isCustomerNow.add(c);

                } else
                    System.out.println(c.getName() + "s medlemskap har gått ut.");
                }
                foundCustomer = true;
        }
        if (!foundCustomer) {
            System.out.println("Den här personen har aldrig varit medlem på Best Gym Ever.");
        }
        return isCustomerNow;
    }

    protected void writeToFileIfCustomer(String writeFile, List<Customer> isCustomerNow) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(writeFile, true))) {

            for (Customer c : isCustomerNow) {
                    writer.print("Medlem: " + c.getName() + ", " + c.getSocialSecurityNumber()
                            + "\n" +"Besökte gymmet: " + LocalDate.now() + "\n" + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas.");
            e.printStackTrace();
            System.exit(0);

        } catch (IOException e) {
            System.out.println("Gick ej att skriva till filen.");
            e.printStackTrace();
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Ett fel uppstod.");
            e.printStackTrace();
            System.exit(0);
        }
    }
}


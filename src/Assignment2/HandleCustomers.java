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



    /*
    public static List<Customer> isCustomerNow(List<Customer> allCustomers) {

        List<Customer> isCustomerNow = new ArrayList<>();

        for (Customer c : allCustomers) {

            LocalDate dateToday = LocalDate.now();
            LocalDate input = LocalDate.parse(c.getMemberSince());
            Period p = Period.between(input, dateToday);

            if (p.getYears() < 1) {
                isCustomerNow.add(c);
            }
        }
        return isCustomerNow;
    }

     */

    protected List<Customer> checkIfCustomerNow(List<Customer> allCustomers, String input) {

        List<Customer> isCustomerNow = new ArrayList<>();

        boolean foundCustomer = false;
        for (Customer c : allCustomers) {
            if (c.getName().equalsIgnoreCase(input) || c.getSecurityNumber().equalsIgnoreCase(input)) {

                LocalDate dateToday = LocalDate.now();
                LocalDate inputDate = LocalDate.parse(c.getMemberSince());
                Period p = Period.between(inputDate, dateToday);

                if (p.getYears() < 1) {
                    System.out.println(c.getName() + " är medlem på Best Gym Ever. Välkommen!");
                    isCustomerNow.add(c);

                } else if (p.getYears() > 1) {
                    System.out.println(c.getName() + "s medlemskap har gått ut.");
                }
                foundCustomer = true;
            }
        }
        if (!foundCustomer) {
            System.out.println("Den här personen har aldrig varit medlem på Best Gym Ever.");
        }
        return isCustomerNow;
    }

    protected void writeToFileIfCustomer(String writeFile, List<Customer> isCustomerNow) {
        Path pathOutName = Paths.get(writeFile);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(pathOutName))) {

            for (Customer c : isCustomerNow) {
                    writer.print(LocalDate.now() + " " + c.getName() + " " + c.getSecurityNumber() + "\n");
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
        /*
    public static void writeToFileIfCustomer(String writeFile, List<Customer> isCustomerNowList, String input) {
        Path pathOutName = Paths.get(writeFile);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(pathOutName));) {

            for (Customer c : isCustomerNowList) {
                if (c.getName().equalsIgnoreCase(input) || c.getSecurityNumber().equalsIgnoreCase(input)) {
                    writer.print(LocalDate.now() + " " + c.getName() + " " + c.getSecurityNumber() + "\n");
                }
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
*/


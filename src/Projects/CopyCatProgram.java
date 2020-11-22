package Projects;

import java.util.Scanner;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-07
 * Time: 09:45
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class CopyCatProgram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in, "utf-8");
        //sc.useDelimiter(" ");
        System.out.print("Skriv något: ");

        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if(input.equals("bye")){
                System.exit(0);
            }

            System.out.println("Du skrev: " + "\"" + input + "\"");
            System.out.println();

            System.out.print("Skriv något: ");

        }
    }
}

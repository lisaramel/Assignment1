package Lektion12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-13
 * Time: 09:40
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class LocalDateTimeUppg {

    protected ZonedDateTime timeZone;

    public LocalDateTimeUppg(){
        this.timeZone = timeZone;
    }

    public ZonedDateTime inputTimeZone(String input) {

        LocalDateTime today = LocalDateTime.now();

        if (input.equalsIgnoreCase("Stockholm")){
            ZoneId stockholm = ZoneId.of("Europe/Stockholm");
            return today.atZone(stockholm);
        }
        else if (input.equalsIgnoreCase("Toronto")){
            ZoneId toronto = ZoneId.of("America/Toronto");
            return today.atZone(toronto);
        }
        else if(input.equalsIgnoreCase("Shanghai")){
            ZoneId shanghai = ZoneId.of("Asia/Shanghai");
            return today.atZone(shanghai);
        }

        return timeZone;
    }

    public ZonedDateTime getTimeZone() {
        return timeZone;
    }

    public void mainProgram(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDateTimeUppg ld = new LocalDateTimeUppg();

        System.out.println("Var befinner du dig? ");
        String input = scan.nextLine();



        System.out.println(ld.inputTimeZone(input));

    }
}

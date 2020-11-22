package Bank;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-01
 * Time: 14:11
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNr;

    Person(){}

    Person(String firstName, String lastName, String socialSecurityNr){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNr = socialSecurityNr;
    }
}

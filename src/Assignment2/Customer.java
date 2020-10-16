package Assignment2;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-08
 * Time: 15:32
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Customer {

    protected String name;
    protected String socialSecurityNumber;
    protected String memberSince;

    protected Customer(String securityNumber, String name, String memberSince){
        this.name = name;
        this.socialSecurityNumber = securityNumber;
        this.memberSince = memberSince;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public String getName() {
        return name;
    }
}
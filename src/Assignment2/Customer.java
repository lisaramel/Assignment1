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
}
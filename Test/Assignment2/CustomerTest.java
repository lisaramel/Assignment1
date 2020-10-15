package Assignment2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-08
 * Time: 15:29
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class CustomerTest {

    Customer c = new Customer("7502031234", "Anna Andersson", "2020-11-10");

    @Test
    public void getNameTest(){

        assertEquals(c.getName(), "Anna Andersson");
        assertNotEquals(c.getName(), "Per Persson");
    }

    @Test
    public void getSocialSecurityNumberTest(){

        assertEquals(c.getSecurityNumber(), "7502031234");
        assertNotEquals(c.getSecurityNumber(), "8505132345");
    }

    @Test
    public void getMemberSinceTest(){

        assertEquals(c.getMemberSince(), "2020-11-10");
        assertNotEquals(c.getMemberSince(), "2015-12-29");
    }

}
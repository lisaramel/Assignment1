package Lektion30;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-12
 * Time: 09:55
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class PropertiesTest {

   public PropertiesTest() {

       Properties p = new Properties();

       try{
           p.load(new FileInputStream("src/test.properties"));
       }catch(Exception e){
           System.out.println("Filen kunde inte hittas");
           e.printStackTrace();
       }
   }
}

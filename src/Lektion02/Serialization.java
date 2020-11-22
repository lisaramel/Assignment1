package Lektion02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-10-13
 * Time: 11:53
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Serialization {

    public void fordonToSerializedList(List<Fordon> list, String pathName){
        try(FileOutputStream fileOut = new FileOutputStream(pathName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);){

            out.writeObject(list);
            System.out.println("Sparades i : " + pathName);

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Fordon> fordonDeSerializedList(){
        List<Fordon> list = new ArrayList<>();
        try(FileInputStream fileIn = new FileInputStream("f.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);){
            list = (List<Fordon>) in.readObject();
            return list;
        }
        catch(IOException e){
            System.out.println("Något gick fel");
        }
        catch(ClassNotFoundException e){
            System.out.println("Fordon okänd klass");
        }
        return list;
    }


}

package Projects.PhoneBook.ClientPhoneBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-09
 * Time: 16:11
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Database {

    private final Friend f1 = new Friend("Lisa",  0704777225L, "1993-03-06", "lisa@hotmail.com");
    private final Friend f2 = new Friend("Hvile",  0701147110L, "1991-12-12", "hvile@hotmail.com");
    private final Friend f3 = new Friend("Anton", 0731157610L, "1995-08-22", "anton@hotmail.com");
    private final Friend f4 = new Friend("Tesse",  0731157610L, "1993-04-07", "tesse@hotmail.com");

    private final List<Friend> allFriends = new ArrayList<>();

    public Database(){
        allFriends.add(f1);
        allFriends.add(f2);
        allFriends.add(f3);
        allFriends.add(f4);
    }

    public Friend getFriend(String input){
        for(Friend f : allFriends){
            if(f.getName().equalsIgnoreCase(input)){
                return f;
            }
        }
        return null;

    }
}

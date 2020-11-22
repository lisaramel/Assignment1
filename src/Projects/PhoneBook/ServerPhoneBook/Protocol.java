package Projects.PhoneBook.ServerPhoneBook;

import Projects.PhoneBook.ClientPhoneBook.Database;
import Projects.PhoneBook.ClientPhoneBook.Friend;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-10
 * Time: 16:57
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Protocol {

    private static final int WAITING = 0;
    private static final int ANSWER = 1;

    private int state = WAITING;

    Database d = new Database();
    Friend responsFromDb;

    public Object processInput(String input){
        Object output = null;

        if(state == WAITING) {
            output = new Initiate();
            state = ANSWER;
        }
        else if(state == ANSWER){
                responsFromDb = d.getFriend(((String)input).trim());

                if(responsFromDb == null) {
                    output = new Response(false);
                }
                else{
                    output = new Response(true, responsFromDb);
                }

            }
        return output;
        }
}


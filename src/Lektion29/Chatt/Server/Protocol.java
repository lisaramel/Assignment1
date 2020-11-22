package Lektion29.Chatt.Server;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-11
 * Time: 11:12
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Protocol {

    private static final int WAITING = 0;
    private static final int WRITING = 1;

    private int state = WAITING;

    public String processInput(String input){
        String output = null;

        if(state == WAITING) {
            output = "Välkommen";
            state = WRITING;
        }
        else if(state == WRITING){
            output = input;
        }

        return output;
    }



}

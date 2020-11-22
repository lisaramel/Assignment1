package Projects.PhoneBook.ServerPhoneBook;

import Projects.PhoneBook.ClientPhoneBook.Friend;

import java.io.Serializable;

/**
 * Created by Lisa Ramel
 * Date: 2020-11-10
 * Time: 10:52
 * Project: Objektorienterad programmering och Java
 * Copywrite: MIT
 */
public class Response implements Serializable {

    private boolean found;
    private Friend friend;

    public Response(boolean found){
        this.found = found;
    }

    public Response(boolean found, Friend friend){
        this.found = found;
        this.friend = friend;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }
}

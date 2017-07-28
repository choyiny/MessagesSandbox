package in.choy.message;

import java.util.ArrayList;

/**
 * Created by choyin on 28/7/2017.
 */

public class MyAwesomeMessages {

    private static final MyAwesomeMessages INSTANCE = new MyAwesomeMessages();

    private ArrayList<Message> myMessages = new ArrayList<>();

    public static MyAwesomeMessages getInstance() {
        return INSTANCE;
    }

    public boolean sendMessage(String title, String message) {
        Message msg = new Message(title, message);
        myMessages.add(msg);
        return true;
    }

    public ArrayList<Message> getAllUnreadMessages() {
        ArrayList<Message> unreadMessages = new ArrayList<>();
        for (Message msg: myMessages) {
            if (!msg.isRead()) {
                unreadMessages.add(msg);
            }
        }
        return unreadMessages;
    }

    public ArrayList<Message> getAllMessages() {
        return myMessages;
    }
}

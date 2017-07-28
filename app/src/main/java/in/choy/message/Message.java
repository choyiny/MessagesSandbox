package in.choy.message;

/**
 * Created by choyin on 28/7/2017.
 */

public class Message {

    private String message;
    private String title;
    private String sender;
    private boolean read = false;

    public Message(String title, String message) {
        this.setTitle(title);
        this.setMessage(message);
        this.setSender("Myself");
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String readMessage() {
        this.read = true;
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOverview() {
        if (message.length() > 50) {
            return message.substring(0, 50) + "...";
        } else {
            return message;
        }
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isRead() {
        return this.read;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

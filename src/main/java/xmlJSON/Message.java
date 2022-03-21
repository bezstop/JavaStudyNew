package xmlJSON;

public class Message {
    private String message;
    private MessageFormat messageFormat;

    public Message(String message, MessageFormat messageFormat) {
        this.message = message;
        this.messageFormat = messageFormat;
    }

    public String getMessage() {
        return message;
    }

    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

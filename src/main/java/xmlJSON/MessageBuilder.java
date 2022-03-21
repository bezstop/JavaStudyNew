package xmlJSON;

public class MessageBuilder {
    public MessageBuilder() {
    }

    public Message buildMessage(String content) {
        MessageFormat messageFormat = null;
        if (content.contains("XML")) {
            messageFormat = MessageFormat.XML;
        } else if (content.contains("JSON")) {
            messageFormat = MessageFormat.JSON;
        }
        return new Message(content, messageFormat);
    }
}

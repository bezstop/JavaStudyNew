package xmlJSON;

public class XMLParser implements MessageParser {

    @Override
    public Message parse(Message message) throws Exception {
        if (message.getMessageFormat()!= MessageFormat.XML) {
            throw new Exception();
        }
        message.setMessage(message.getMessage().replace("_Xml", "OK"));
        return message;
    }
}


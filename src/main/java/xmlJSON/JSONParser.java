package xmlJSON;

public class JSONParser implements MessageParser {

    @Override
    public Message parse(Message message) throws Exception {
        if (message.getMessageFormat()!= MessageFormat.JSON) {
            throw new Exception();
        }
        message.setMessage(message.getMessage().replace("_Json", "OK"));
        return message;
    }
}




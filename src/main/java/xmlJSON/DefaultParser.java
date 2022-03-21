package xmlJSON;

public class DefaultParser implements MessageParser{

    @Override
    public Message parse(Message message) {
        return message;
    }
}

package xmlJSON;

public class MessageRunner {
    public static void main(String[] args) throws Exception {
        MessageBuilder messageBuilder = new MessageBuilder();
        SelectStrategy selectRunStrategy = new SelectStrategy(new JSONParser(), new XMLParser(), new DefaultParser());
        System.out.println(selectRunStrategy.selectRunStrategy(messageBuilder.buildMessage("JSON header_Json body_Json")));
        System.out.println(selectRunStrategy.selectRunStrategy(messageBuilder.buildMessage("XML header_Xml body_Xml")));
        System.out.println(selectRunStrategy.selectRunStrategy(messageBuilder.buildMessage("HTML header_Xml body_Xml")));
    }
}

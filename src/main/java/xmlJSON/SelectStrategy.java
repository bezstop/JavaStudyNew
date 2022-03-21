package xmlJSON;

public class SelectStrategy {
    private JSONParser JSONParser;
    private XMLParser XMLParser;
    private DefaultParser DefaultParser;

    public SelectStrategy(xmlJSON.JSONParser JSONParser, xmlJSON.XMLParser XMLParser, xmlJSON.DefaultParser defaultParser) {
        this.JSONParser = JSONParser;
        this.XMLParser = XMLParser;
        this.DefaultParser = defaultParser;
    }

    public String selectRunStrategy(Message message) throws Exception {

        if (message.getMessageFormat() == MessageFormat.XML) {
            return XMLParser.parse(message).getMessage();
        } else if (message.getMessageFormat() == MessageFormat.JSON) {
            return JSONParser.parse(message).getMessage();
        }
        return DefaultParser.parse(message).getMessage();
    }
}

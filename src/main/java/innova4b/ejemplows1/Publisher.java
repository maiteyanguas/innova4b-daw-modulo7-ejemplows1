package innova4b.ejemplows1;

import javax.xml.ws.Endpoint;

public class Publisher 
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://localhost:8080/WS/StringService", new StringServiceImpl());
    }
}

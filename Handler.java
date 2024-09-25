import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class Handler implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        var jsonResponse = new HashMap<String, String>();
        jsonResponse.put("status", "OK");

        String response = jsonResponse.toString();

        t.getResponseHeaders().set("Content-Type", "application/json");
        t.sendResponseHeaders(200, response.length());

        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}

package handler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

public class HealthCheck implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        String response = "{\"status\":\"OK\"}";

        t.getResponseHeaders().set("Content-Type", "application/json");
        t.sendResponseHeaders(200, response.length());

        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}

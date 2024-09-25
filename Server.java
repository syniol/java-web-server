import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

import handler.HealthCheck;

public class Server {
    public static Integer WebServerPort = 80;
    public static Integer SocketBacklog = 0;

    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(
                    new InetSocketAddress(WebServerPort),
                    SocketBacklog
            );

            server.createContext("/health", new HealthCheck());

            server.setExecutor(null);

            server.start();

            System.out.println("\uD83D\uDE80 Server started on port: " + WebServerPort);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

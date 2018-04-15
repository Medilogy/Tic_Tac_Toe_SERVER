import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class Server {

    private final Logger logger = Logger.getLogger(getClass().getName());

    public static final int DEFAULT_PORT = 5000;
    private static final String DEFAULT_HOST_NAME = "localhost";
    private ServerSocket serverSocket;

    // creates server with default port = 5000 and listens on localhost
    public Server() throws IOException {
        this.serverSocket = new ServerSocket(DEFAULT_PORT, 10, InetAddress.getByName(DEFAULT_HOST_NAME));
    }

    public Server(String address, int port, int maxConnection) throws IOException {
        this.serverSocket = new ServerSocket(port, maxConnection, InetAddress.getByName(address));
    }

    public void waitForConnection() throws IOException {
        Socket socket = null;
        while ((socket = serverSocket.accept()) != null) {
            talkWithClient(socket);
        }

    }

    private void talkWithClient(Socket socket) {
        // communication with client

    }
    public void close() throws IOException {
        this.serverSocket.close();
    }
}
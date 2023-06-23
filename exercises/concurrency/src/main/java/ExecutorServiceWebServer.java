import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceWebServer {

    static final int PORT = 80;

    public static void main(String[] args) throws IOException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        try (ServerSocket socket = new ServerSocket(80)) {
            System.out.println("Server listening on port " + PORT);
            while (!es.isShutdown()) {
                final Socket client = socket.accept();
                es.submit(new RequestHandler((client)));
            }
        } finally {
            System.out.println("Server shutting down");
        }
    }
}

class RequestHandler implements Runnable {
    private Socket client;

    public RequestHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            System.out.println("handler " + client.getPort());
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println("HTTP/1.1 200 OK");
            out.println("");
            out.println("Hello, web client!");
            out.println("From thread " + Thread.currentThread().getName());
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


package Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
/**
 * @author AdrChacon
 */

public class Server {

    private static final int PORT = 12500;

    public static void main(String[] args) throws Exception {
        System.out.println("The chat server is running.");
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
              new Handler(listener.accept()).start();
              
            }
        } finally {
            listener.close();
        }
    }

    private static class Handler extends Thread {
        private String name;
        private Socket socket;
        public BufferedReader in;
        private PrintWriter out;

        public Handler(Socket socket) {
            this.socket = socket;
            System.out.println("Cliente aceptado");
        }


        public void run() {
            try {

                
                in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
                System.out.println(in.readLine());
                out = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                }
            }
        }
    }
}

package Client;

/**
 * @author AdrChacon
 */
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import GUI.juedo;
import GUI.interfaz;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserClient {

    BufferedReader in;
    PrintWriter out;
    JFrame frame = new JFrame("Chatter");

    public UserClient() {
        
    }
    private String getServerAddress() {
        return JOptionPane.showInputDialog(
            frame,
            "Enter IP Address of the Server:",
            "Welcome to the Chatter",
            JOptionPane.QUESTION_MESSAGE);
    }

    private void run() throws IOException {

        String serverAddress = getServerAddress();
        Socket socket = new Socket(serverAddress, 12500);
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    
    }
    public static void main(String[] args) throws Exception {
        UserClient client = new UserClient();
        juedo GUI = new juedo();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
        client.run();
    }
}
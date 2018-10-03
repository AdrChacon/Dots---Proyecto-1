package Server;
/**
 * @author AdrChacon
 */
import java.net.*;
import java.io.*;
import EstructurasDatos.*;
import Comunicacion.JSONPackage;

public class Servidor {
    private static final int PORT = 12500;
    private static Matrix Board = new Matrix();
    private static int player1Score;
    private static int player2Score;
    private static int TurnPlayer;
    private static int CurrentPlayers;
    private static int MaxPlayers = 2;
    private BufferedReader in;
    private PrintWriter out;
    public static void main(String args[]){
        ServerSocket server = null;
        Socket socket = null;
        try{
            server = new ServerSocket(PORT);
            System.out.println("Servidor iniciado.");
            System.out.println("Esperando clientes ...");
            Board.crearMatriz();
            System.out.println("Iniciando tablero.");
            player1Score = 0;
            player2Score = 0;
            CurrentPlayers = 0;
            System.out.println("Iniciando variables.");
            TurnPlayer = 1;
            
        } catch (IOException e){
            e.printStackTrace();
        }
        while(true){
            try{
            socket = server.accept();
            System.out.println("Cliente aceptado.");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

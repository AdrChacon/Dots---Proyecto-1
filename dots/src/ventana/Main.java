package ventana;

import EstructurasDatos.Matrix;
/**
 *
 * @author Fabián Fallas
 */
public class Main {
    
    public static void main(String[] args) {
        
        Matrix Matriz = new Matrix();
        Matriz.crearMatriz();
        Matriz.ConnectDots(Matriz.buscarLista(0, 0), Matriz.buscarLista(1, 0));
        Matriz.ConnectDots(Matriz.buscarLista(1, 0), Matriz.buscarLista(1, 1));
        Matriz.ConnectDots(Matriz.buscarLista(1, 1), Matriz.buscarLista(0, 1));
        Matriz.ConnectDots(Matriz.buscarLista(0, 1), Matriz.buscarLista(0, 0));
        
        
        
        
    }
    
}

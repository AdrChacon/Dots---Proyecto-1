package EstructurasDatos;
import java.util.*;

public class Matrix{
    private SimpleList list;
    private int size;
    private SimpleList head;
    private ArrayList<Node> Figure;
    
    public Matrix(){
        this.head = null;
        this.size = 0;
        Figure = new ArrayList();
    }
    public void emptyFigureList(){
        Figure.clear();
    }
    public void crearMatriz(){
        SimpleList aux = this.head;
        for(int X = 0; X<5; X++){
            if(aux == null){
            SimpleList Column = new SimpleList();
            this.head = Column;
            aux = Column;
            this.size++;
            for(int Y = 0; Y<5; Y++){
            Column.insertLast(X, Y);
            }
            
            } else{
                SimpleList Column = new SimpleList();
                aux.setNextList(Column);
                aux = Column;
                this.size++;
                for(int Y = 0; Y<5; Y++){
            Column.insertLast(X, Y);
            }
            }
        }
            
      
    }
    /*public SimpleList crearLista(int fila){
        SimpleList columna = new SimpleList();
        Node sN = null;
        for (int Y = 0; Y<5; Y++){
            columna.insertLast(fila, Y);
        }
        return columna;
        
    
    }*/
    public Node buscarLista(int x, int y){
       SimpleList temporal = this.head;
       if (x > 4 || y > 4){
            return null;
       } else{
       while (temporal != null && temporal.getHead().getX() != x ){
           temporal = temporal.getNextList();
       }
       if (temporal == null){
           return null;
       } else {
       Node Row = temporal.getHead();
       while (Row != null && Row.getY() != y){
           Row = Row.getNext();
       }
       if (Row == null){
           return null;
       } else{
           return Row;
       }
       }
       }
       
    }
    public void ConnectDots(Node A, Node B){
        if (RecorrerCaminos(A, B) == B){
        A.InsertArray(B);
        B.InsertArray(A);
        Figure.add(B);
        for(int X = 0; X < 5; X++){
            for(int Y = 0; Y < 5; Y++){
                buscarLista(X, Y).MarkUnseen();
            }}
        System.out.println(this.Figure);
        System.out.println("El tamaño de la lista Figure es: " + Figure.size());
        System.out.println("SE FORMO UNA FIGURA!");
        Figure.clear();
         /*Pasa algo*/
        } else{
        A.InsertArray(B);
        B.InsertArray(A);
        for(int X = 0; X < 5; X++){
            for(int Y = 0; Y < 5; Y++){
                buscarLista(X, Y).MarkUnseen();
            }}
        }
    }
    public Node RecorrerCaminos(Node Current, Node Final){
        Current.MarkSeen();
        for(int Iter = 0; Iter < Current.getArrayLength(); Iter++){
            if(Current.getConection(Iter).CheckSeen()){
            } else{
            if(Current.getConection(Iter) == Final){
                Figure.add(Current);
                return Final;
            } else{
                if(RecorrerCaminos(Current.getConection(Iter), Final) == Final){
                Figure.add(Current);
                return Final;
                }else {}
            }
            }
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        
        Matrix Matriz = new Matrix();
        Matriz.crearMatriz();
        
        
        Matriz.ConnectDots(Matriz.buscarLista(0, 0), Matriz.buscarLista(1, 0));
        Matriz.ConnectDots(Matriz.buscarLista(1, 0), Matriz.buscarLista(1, 1));
        Matriz.ConnectDots(Matriz.buscarLista(1, 1), Matriz.buscarLista(0, 1));
        Matriz.ConnectDots(Matriz.buscarLista(0, 1), Matriz.buscarLista(0, 0));
        System.out.println("Test");
        Matriz.ConnectDots(Matriz.buscarLista(1, 0), Matriz.buscarLista(2, 1));
        Matriz.ConnectDots(Matriz.buscarLista(2, 1), Matriz.buscarLista(1, 1));
        
        
        
    }
}

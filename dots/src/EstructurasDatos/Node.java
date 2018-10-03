package EstructurasDatos;
import java.util.ArrayList;

public class Node{
    private Object data;
    private Node next;
    private int Pos; 
    private int x;
    private int y;
    private ArrayList<Node> Conexiones;
    private boolean IsSeen;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
        this.Conexiones = new ArrayList();
        this.next = null;
        this.IsSeen = false;
    }
    public boolean CheckSeen(){
        return IsSeen;
    }
    public void MarkSeen(){
        IsSeen = true;
    }
    public void MarkUnseen(){
        IsSeen = false;
    }
    public void InsertArray(Node Dot){
        Conexiones.add(Dot);
    }
    public int getArrayLength(){
        int Length = Conexiones.size();
        return Length;
    }
    public Node getConection(int Index){
        return Conexiones.get(Index);
                }
    public ArrayList getConnections(){
        return Conexiones;
    }
    public int getY(){
        return this.y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getPos(){
        return this.Pos;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public Node getNext(){
        return this.next;
    }
}

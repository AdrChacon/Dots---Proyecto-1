package EstructurasDatos;


public class SimpleList{
    private Node head;
    private int size;
    private SimpleList nextList;
    
    public SimpleList(){
     this.head = null;
     this.size = 0;
     this.nextList = null;
    }
    public int getSize(){
        return this.size;
    }
    
    public Node getHead(){
        if(head == null){
            return null;
        } else{
            return this.head;
        }
    }
    public void insertLast(int xPos, int yPos){
        Node newNode = new Node(xPos, yPos);
        if(head == null){
            this.head = newNode;
            this.size++;
        } else{
            Node aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
            this.size++;
        }
    }
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else{
            return false;
        }
    }
    public void setNextList(SimpleList List){
        this.nextList = List;
    }
    public SimpleList getNextList(){
        return this.nextList;
    }
}

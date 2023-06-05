class Node{

    String item;
    
    Node next;
    
    }
    
public class RubenLinkedList {
    private Node head;
    private int n;
    
    public RubenLinkedList(){
        head = null;
        n = 0;
    }

    public void add(int index, String item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;

        if(head == null){
            if(index != 0){
                return;
            }
            head = newNode;
            n++;
            return;
        }
        else if(head != null && index == 0){
            head = newNode;
            n++;
            return;
        }
        if(index > n){
            return;
        }

        Node currentNode = head;
        Node previous = null;

        int i = 0;
        while(i<index){
            previous = currentNode;
            currentNode = currentNode.next;
            if(currentNode == null){
                return;
            }
            i++;
        }
        newNode.next = currentNode;
        previous.next = newNode;


    }

    public String peek(){

        if(head != null) return head.item;
        
        return "Null"; // Safe return!
        
        }
}


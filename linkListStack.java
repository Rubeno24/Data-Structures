public class linkListStack {

    // Fields

    private Node top; // Top of stack

    private int n; // How many items

    // Small subclass; I normally am not a fan of subclassing but this is a tiny
    // implementation

    private class Node {

        int item; // Holds the discrete item in node

        Node next; // Reference to next node in list

    }

    // Constructor

    public linkListStack() {

        top = null;

        n = 0;

    }

    // Methods

    public void push(int item) {

        Node oldTop = top;

        top = new Node();

        top.item = item;

        top.next = oldTop;

        n++;

    }

    public int pop() {

        if (n == 0)
            return -1;

        int ret = top.item;

        top = top.next;

        n--;

        return ret;

    }

    public int peek() {

        if (n == 0)
            return -1;

        return top.item;

    }

    public boolean isEmpty() {

        return top == null;

    }

    public int size() {

        return n;

    }

    public void clear() {

        top = null;

        n = 0;

    }

}
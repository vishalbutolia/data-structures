package datastructures.tree;

public class Stack {

    private final int MAX = 1024;
    private Node[] nodeStack = new Node[MAX];
    private int currentPtr = -1;

    public boolean push(Node node) {
        if (currentPtr >= MAX - 1) {
            return false;
        }
        nodeStack[++currentPtr] = node;
        return true;
    }

    public Node pop() {
        if (currentPtr == -1) {
            return null;
        }
        return nodeStack[currentPtr--];
    }

    public Node peek() {
        return nodeStack[currentPtr];
    }

    public boolean isEmpty() {
        if (currentPtr == -1) {
            return true;
        }
        return false;
    }
}

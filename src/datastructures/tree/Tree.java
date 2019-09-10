package datastructures.tree;

public class Tree {

    private Stack stack = new Stack();

    private Node createNode(int key) {
        Node node = new Node();
        node.key = key;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node insertNode(Node root, int key) {
        if (root == null) {
            return createNode(key);
        }

        if (key < root.key) {
            root.left = insertNode(root.left, key);
        } else {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public Node deleteNode(int key, Node node) {
        if (node == null) {
            return node;
        }

        if (key < node.key) {
            node.left = deleteNode(key, node.left);
        } else if (key > node.key) {
            node.right = deleteNode(key, node.right);
        } else {
            if (node.left != null && node.right != null) {
                node.key = minimumValue(node.right);
                node.right = deleteNode(node.key, node.right);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                return null;
            }
        }
        return node;
    }

    private int minimumValue(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.key;
    }


    public void inorderRecursive(Node root) {
        if (root == null) {
            return;
        }

        inorderRecursive(root.left);
        System.out.print(root.key + " ");
        inorderRecursive(root.right);
    }


    public void postOrderRecursive(Node root) {
        if (root == null) {
            return;
        }

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.key + " ");
    }

    public void inorderIterative(Node root) {
        Node current = root;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            Node temp = stack.pop();
            System.out.print(temp.key + " ");
            if (temp.right != null) {
                current = temp.right;
            }
        }
    }

    public int heightOfANode(Node root) {
        if (root == null) {
            return -1;
        }
        return maxOfTwoValues(heightOfANode(root.left), heightOfANode(root.right)) + 1;
    }

    private int maxOfTwoValues(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

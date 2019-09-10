package datastructures.tree;

public class EntryPoint {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = null;
        root = tree.insertNode(root, 20);
        root = tree.insertNode(root, 10);
        root = tree.insertNode(root, 30);
        root = tree.insertNode(root,5);
        root = tree.insertNode(root, 15);
        root = tree.insertNode(root, 25);
        root = tree.insertNode(root, 35);
        root = tree.insertNode(root, 40);
        root = tree.insertNode(root, 33);
        root = tree.insertNode(root, 32);
//        tree.inorderIterative(root);

        System.out.println(tree.heightOfANode(root));

//        tree.deleteNode(35,root);
//        tree.deleteNode(15,root);
//
//        tree.inorderIterative(root);


    }

}

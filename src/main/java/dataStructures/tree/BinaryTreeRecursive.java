package dataStructures.tree;


import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else { // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (current.data == data) {
            return true;
        }

        return data < current.data
                ? containsNodeRecursive(current.left, data)
                : containsNodeRecursive(current.right, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }
        current.right = deleteRecursive(current.right, data);
        return current;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traverseInOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();

        //Start from root node
        Node curr = root;

        //if current node is null and stack is also empty, we are done
        while(!stack.empty() || curr != null){
            //if current node is not null, push it to the stack
            //and move to its left child
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }else{
                //if current node is null, we pop an element from stack
                //print it and finally set current node to its right child
                curr = stack.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }

        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null)
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();

        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.data);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }

}


public class BinaryTreeRecursive {

    static BinaryTree binaryTree1 = new BinaryTree();
    static BinaryTree binaryTree2 = new BinaryTree();

    public static void main(String[] args) {

        binaryTree1.add(6);
        binaryTree1.add(4);
        binaryTree1.add(8);
        binaryTree1.add(3);
        binaryTree1.add(5);
        binaryTree1.add(7);
        binaryTree1.add(9);


        binaryTree2.add(6);
        binaryTree2.add(4);
        binaryTree2.add(8);
        binaryTree2.add(3);
        binaryTree2.add(5);
        binaryTree2.add(7);
        binaryTree2.add(9);

        if(isIdentical(binaryTree1.root, binaryTree2.root)){
            System.out.println("Identical");
        }else {
            System.out.println("Not Identical");
        }

        System.out.println("Height of Tree is : "+height(binaryTree1.root));
        //addNodes(binaryTree1);
        //System.out.println(binaryTree.containsNode(7));

        //Depth-first search
        System.out.println("Traverse InOrder :");
        //binaryTree.traverseInOrder(binaryTree.root);

        System.out.println("\n Traverse PreOrder :");
        //binaryTree.traversePreOrder(binaryTree.root);

        System.out.println("\n Traverse PostOrder :");
        //binaryTree.traversePostOrder(binaryTree.root);


        //Breadth-first search
        System.out.println("\n Traverse LevelOrder :");
        //binaryTree.traverseLevelOrder();
    }

    public static boolean isIdentical(Node node1, Node node2){
        //if both nodes are empty, return null
        if(node1 == null && node2 == null){
            return true;
        }

        //if both tree are non-empty and values of root node matches, recur for their left and right nodes
        return (node1 != null && node2 != null) &&
                (node1.data == node2.data) &&
                isIdentical(node1.left, node2.left) &&
                isIdentical(node1.right, node2.right);
    }

    public static int height(Node node){
        if(node == null){
            return 0;
        }
        return  1+ Math.max(height(node.left), height(node.right));

    }
    /*public static void addNodes(BinaryTree binaryTree) {
        BinaryTreeRecursive.binaryTree.add(6);
        BinaryTreeRecursive.binaryTree.add(4);
        BinaryTreeRecursive.binaryTree.add(8);
        BinaryTreeRecursive.binaryTree.add(3);
        BinaryTreeRecursive.binaryTree.add(5);
        BinaryTreeRecursive.binaryTree.add(7);
        BinaryTreeRecursive.binaryTree.add(9);*/
/*
          6
        /   \
       4     8
      / \   / \
     3   5 7   9
*/
    //}


}

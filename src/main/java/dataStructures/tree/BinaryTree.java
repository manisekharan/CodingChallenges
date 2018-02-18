package coding.dataStructures.tree;

class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node node1 = new Node(5);
        Node node2 = new Node(20);
        root.left = node1;
        root.right = node2;
        printTree(root);
    }

    private static void printTree(Node root) {
        if(root == null) return;
        while(root != null){
            printTree(root.left);
            System.out.println(root.data);
            printTree(root.right);
        }
    }


}

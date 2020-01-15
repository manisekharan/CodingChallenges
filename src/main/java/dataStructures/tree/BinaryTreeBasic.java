package dataStructures.tree;


class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree1{
    Node1 root;

    BinaryTree1(){
        root = null;
    }

    BinaryTree1(int data){
        root = new Node1(data);
    }

}

public class BinaryTreeBasic {
    public static void main(String[] args) {
        BinaryTree1 binaryTree = new BinaryTree1();
        binaryTree.root = new Node1(10);
        binaryTree.root.left = new Node1(20);
        binaryTree.root.right = new Node1(30);
    }


}

package algorithms.search;

import java.util.*;

public class BinaryTree {

    Node root;

    class Node {
        Node left, right;
        int value;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }


    public static void main(String[] args) {

        //Manual
        /*Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);*/
        //System.out.println("Value found : "+new BinaryTree().search(root, 2));
        //System.out.println("Value found : "+new BST().searchLoop(root, 21));
        //https://www.guru99.com/binary-search-tree-data-structure.html

        /*

        |	|---8
        |---7
        |	|---6
        5
        |	|---4
        |---3
        |	|---2

         */


        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(7);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(1);


        tree.printBinaryTree(tree.root, 0);
        //System.out.println("Value found : "+tree.search(13));
        //System.out.println("traverseInOrder : ");
        //tree.traverseInOrder(tree.root);
        tree.delete(3);
        //http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/9-BinTree/BST-delete2.html
        //System.out.println(tree.findBiggestValue(tree.root));
        System.out.println("\n\n");
        tree.printBinaryTree(tree.root, 0);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else if (value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        return current;

    }

    public int search(int value) {
        return search(root, value);
    }


    private int search(Node node, int value) {
        if (node == null) {
            return -1;
        }

        if (node.value == value) {
            return value;
        }

        if (value > node.value) {
            return search(node.right, value);
        } else {
            return search(node.left, value);
        }

    }

    int searchLoop(Node node, int value) {
        Node current = node;
        while (current != null) {
            if (current.value == value) {
                return value;
            }

            if (current.value < value) {
                current = node.right;
            } else {
                current = node.left;
            }
        }
        return -1;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value);
        }
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    //https://www.baeldung.com/java-binary-tree
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public int findBiggestValue(Node root){
        return root.right == null ? root.value : findBiggestValue(root.right);
    }

    public void printBinaryTree(Node root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|---" + root.value);
        } else
            System.out.println(root.value);
        printBinaryTree(root.left, level + 1);
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }


    public void traverseInOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        stack.push(root);
        while(! stack.isEmpty()) {
            while(current.left != null) {
                current = current.left;
                stack.push(current);
            }
            current = stack.pop();
            System.out.println(current.value);
            if(current.right != null) {
                current = current.right;
                stack.push(current);
            }
        }
    }

    public void traversePreOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        stack.push(root);
        while(! stack.isEmpty()) {
            current = stack.pop();
            System.out.println(current.value);

            if(current.right != null)
                stack.push(current.right);

            if(current.left != null)
                stack.push(current.left);
        }
    }

    public void traversePostOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<Node>();
        Node prev = root;
        Node current = root;
        stack.push(root);

        while (!stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                System.out.println(current.value);
                prev = current;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }

}

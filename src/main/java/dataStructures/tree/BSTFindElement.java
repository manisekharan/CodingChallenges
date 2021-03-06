package dataStructures.tree;

import java.util.*;

public class BSTFindElement {

    private static class Node {
        Node left, right;
        int data;

        Node(int newData) {
            left = right = null;
            data = newData;
        }
    }

    private static Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return (node);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Node _root;
        int root_i = 0, root_cnt = 0, root_num = 0;
        root_cnt = in.nextInt();
        _root = null;
        for (root_i = 0; root_i < root_cnt; root_i++) {
            root_num = in.nextInt();
            if (root_i == 0)
                _root = new Node(root_num);
            else
                insert(_root, root_num);
        }

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int _x = in.nextInt();
            System.out.println(isPresent(_root, _x));
        }

        return;
    }


    private static boolean isPresent(Node root, int val) {

        if (root != null) {
            if (root.data == val) {
                return true;
            }else{
                return isPresent(root.left, val) || isPresent(root.right, val);
            }
            /*} else if(root.data > val){
                isPresent(root.left, val);
            } else if(root.d1ata < val){
                isPresent(root.right, val);
            }*/
        }
        return false;

    }
}
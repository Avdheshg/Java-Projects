import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class GFG {

    public static void main(String args[]) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 17;

        System.out.print("Floor: " + (floor(root, 17, null).key));
    }

    public static Node floor(Node root, int x, Node res) {
        if (root == null)
            return null;

        if (root != null) {
            if (root.key == x)
                return root;

            else if (root.key > x)
                floor(root.left, x, res);

            else {
                res = root;
                floor(root.right, x, res);
            }
        }

        return res;
        // Node res=null;
        // while(root!=null){
        // if(root.key==x)
        // return root;
        // else if(root.key>x)
        // root=root.left;
        // else{
        // res=root;
        // root=root.right;
        // }
        // }
        // return res;
    }
}

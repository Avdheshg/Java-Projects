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

    public String toString() {
        return key + " ";
    }    
}

public class GFG {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int n1 = 20, n2 = 50;

        Node ans = lca(root, n1, n2);
        System.out.println("LCA: " + ans.key);
    }

    public static boolean findPath(Node root, ArrayList<Node> p, int n) {
        if (root == null)
            return false;
        p.add(root);
        if (root.key == n)
            return true;

        if (findPath(root.left, p, n) || findPath(root.right, p, n))
            return true;

        p.remove(p.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // if any of the node is not present
        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false)
            return null;
        
        for (Node s : path1) {
            System.out.print(s);
        }
        System.out.println();
        for (Node s : path2) {
            System.out.print(s);
        }
        System.out.println();

        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++){
            if (path1.get(i+1) != path2.get(i+1)){
                System.out.println("i " + i);
                return path1.get(i);
            }
        }
        return null;
    }
}
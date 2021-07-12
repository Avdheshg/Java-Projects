import java.util.*;

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
      
        }
}

public class Main {

    public static void main(String[] args) {
        
        TreeNode root=new TreeNode(15);
    	root.left=new TreeNode(5);
    	root.left.left=new TreeNode(3);
    	root.right=new TreeNode(20);
    	root.right.left=new TreeNode(18);
    	root.right.left.left=new TreeNode(16);
    	root.right.right=new TreeNode(80);
    	int k=3;
    	
    	// System.out.print("Kth Smallest: ");
    	System.out.println(kthSmallest(root,1));

    }

    static int  count = 0;
    static int res = 0;
    public static int kthSmallest(TreeNode root, int k) {
        
        // if (root == null)
        //     return -1;
        
        if (root.left != null) 
            kthSmallest(root.left, k);

        count++;
        System.out.println("count" + count + "\tNode:" + root.val);
        // if (root !=)
        if (count == k) {
            System.out.println("Equal");
            System.out.println("Root" + root.val);
            res = root.val;
            return root.val;
        }

        if (root.right != null) 
            kthSmallest(root.right, k);
        
        return res;
        
    }
}
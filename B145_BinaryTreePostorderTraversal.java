import java.util.*;
public class B145_BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        Solve(root, list);
        return list;
    }

    public void Solve(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        Solve(root.left, list);
        Solve(root.right, list);
        list.add(root.val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

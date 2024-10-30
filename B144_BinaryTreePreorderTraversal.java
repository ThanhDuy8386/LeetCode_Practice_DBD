import java.util.*;
public class B144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        Solve(root, list);
        return list;
    }

    public void Solve(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        list.add(root.val);
        if(root.left != null) {
            Solve(root.left, list);
        }
        if(root.right != null) {
            Solve(root.right, list);
        }
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

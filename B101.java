import java.util.ArrayList;

public class B101 {
    // 101. Symmetric Tree
    public static void main(String[] args) {

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

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return check(root.left, root.right);
    }

    public boolean check(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null) {
            return true;
        }
        if(n1 == null || n2 == null) {
            return false;
        }
        return (n1.val == n2.val) && check(n1.left, n2.right) && check(n1.right, n2.left);
    }
}

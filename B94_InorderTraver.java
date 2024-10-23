import java.util.ArrayList;
import java.util.List;

public class B94_InorderTraver {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> lists = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        var lists = new ArrayList<Integer>();
        Solve(root, lists);
        return lists;
    }

    public void Solve(TreeNode node, List<Integer> lists) {
        if(node != null) {
            Solve(node.left, lists);
            lists.add(node.val);
            Solve(node.right, lists);
        }
    }
//done
    static class TreeNode {
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

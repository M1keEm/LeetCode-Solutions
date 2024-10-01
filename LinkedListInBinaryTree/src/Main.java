public class Main {
    public static void main(String[] args) {
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        return checkPath(root, head);
    }

    private boolean checkPath(TreeNode node, ListNode head) {
        if(node == null) return false;
        if(dfs(node, head)) return true;
        return checkPath(node.left, head) || checkPath(node.right, head);
    }
}


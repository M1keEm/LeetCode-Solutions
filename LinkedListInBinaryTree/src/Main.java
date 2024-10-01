public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        //testing tree too long to implement locally, proceeded with cloud service
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

    private boolean dfs(TreeNode node, ListNode head) {
        if(head == null) return true; //if head has ended, then we have matched all nodes in head with our tree
        if(node == null) return false; //if tree has ended we haven't found head in our tree, not yet anyway
        if(node.val != head.val) return false; //wrong values, do not match
        return dfs(node.left, head.next) || dfs(node.right, head.next); //if the values match and neither node nor head has ended, check the children of the current node with head.next node
    }
}

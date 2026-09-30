class Solution {
    boolean flag;
    TreeNode prev;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev==null) prev = root;
        else if(prev.val >= root.val) flag = false;
        else prev = root;
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        prev = null;
        if(root==null) return true;
        inorder(root);
        return flag;
    }
}

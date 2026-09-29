class Solution {
    public int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left) , height(root.right)) + 1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return height(root);
    }
}

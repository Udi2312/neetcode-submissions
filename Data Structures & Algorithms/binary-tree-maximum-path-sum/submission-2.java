class Solution {
    int ans;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if(l<0) l = 0;
        if(r<0) r = 0;
        ans = Math.max(ans , l+r+root.val);
        return root.val + Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
}

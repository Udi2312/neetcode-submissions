class Solution {
    int ans;
    int v;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(v==1) ans = root.val;
        v--;
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
         v = k;
        inorder(root);
        return ans;
    }
}

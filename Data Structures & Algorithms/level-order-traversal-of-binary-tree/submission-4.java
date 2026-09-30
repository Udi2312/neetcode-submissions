class Solution {
    List<List<Integer>> ans;
    public void solve(TreeNode root, int l){
        if(root == null) return;
        if(ans.size()+1 == l) ans.add(new ArrayList<>());
        ans.get(l-1).add(root.val);
        solve(root.left,l+1);
        solve(root.right,l+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
         ans = new ArrayList<>();
         if(root==null) return ans;
         solve(root,1);
         return ans;
    }
}

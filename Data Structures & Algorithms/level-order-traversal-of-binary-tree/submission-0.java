class Solution {
    List<List<Integer>> ans;
    public void solve(TreeNode root, int l){
        if(root == null) return;
        if(ans.size() == l) ans.add(new ArrayList<>());
        ans.get(l).add(root.val);
        solve(root.left,l+1);
        solve(root.right,l+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
         ans = new ArrayList<>();
         if(root==null) return ans;
         solve(root,0);
         return ans;
    }
}

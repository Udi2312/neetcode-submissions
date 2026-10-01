public class Codec {
    StringBuilder a;
    int idx;
    public void helper(TreeNode root) {
        if (root == null) {
            a.append("#,");
            return;
        }
        a.append(root.val).append(",");
        helper(root.left);
        helper(root.right);
    
    }
    public TreeNode build(String[] arr){
        if(arr[idx].equals("#")){
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[idx]));
        idx++;
        root.left = build(arr);
        root.right = build(arr);
        return root;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        a = new StringBuilder("");
        helper(root);
        return a.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        idx = 0;
       return build(arr);
    }
}

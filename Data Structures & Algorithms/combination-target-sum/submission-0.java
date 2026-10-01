class Solution {
    List<List<Integer>> ans;
    public void helper(int[] nums, int target, int idx, List<Integer> curr){
        if(idx == nums.length || target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums,target-nums[idx], idx, curr);
        curr.remove(curr.size()-1);
        helper(nums,target, idx+1, curr);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans = new ArrayList<>();
        helper(nums,target,0, new ArrayList<>());
        return ans;
    }
}

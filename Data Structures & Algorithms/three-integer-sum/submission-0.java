class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
        int j = i+1;
        int k = nums.length-1;
            while(j<k){
                int curr = nums[i] + nums[j] + nums[k];
                if(curr < 0) j++;
                else if(curr > 0) k--;
                else{
                    ans.add(new ArrayList<>(List.of(nums[i] , nums[j], nums[k])));
                    j++;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    k--;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
                    i++;
                    while(i<nums.length && nums[i] == nums[i-1]) i++;
        }
        return ans;
    }
}

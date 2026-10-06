class Solution {
    public int helper(int[] nums , int i , int j ,int dp[]){
        if(i >= j){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        // take
         
       int take= nums[i] + helper(nums , i+2,j,dp);
        // skip
        int skip = helper(nums , i+1,j,dp);
        return dp[i] = Math.max(take , skip);
    }
    public int rob(int[] nums) {
         int n = nums.length;
         if(n == 1) {
            return nums[0];
        }
        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        return Math.max(helper(nums , 0 , n-1, dp1) , helper(nums , 1 ,n, dp2));
    }
}

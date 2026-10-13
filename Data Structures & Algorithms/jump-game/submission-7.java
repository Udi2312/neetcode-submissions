class Solution {
    public boolean canJump(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        vis[0] = true;
        if(nums.length == 1) return true;
        for(int i = 0; i<nums.length; i++){
            if(vis[nums.length-1]) return true;
            if(!vis[i]) return false;
            int max = nums[i];
            int j = i+1;
            while(max > 0 && j < nums.length){
                vis[j] = true;
                j++;
                max--;
            }
        }
        return vis[nums.length-1];
    }
}

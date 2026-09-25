class Solution {
    public int findMin(int[] nums) {
       int i = 0;
       int j = nums.length-1;
       int ans = 1001;
        if(nums[i] <= nums[j]) return nums[i];
       while(i<j){
        int mid = i + (j-i)/2;
        if(nums[mid] > nums[j]) i = mid + 1;
        else{
            // ans = Math.min(ans , nums[mid]);
            j = mid;
        }
       }
       return nums[i];
    }
}

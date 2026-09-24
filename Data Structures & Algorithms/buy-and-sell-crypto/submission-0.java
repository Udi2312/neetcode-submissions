class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                max = arr[i];
            }
            else{
                max = arr[i];
                ans = Math.max(ans , max-min);
            }
        }
        return ans;
    }
}

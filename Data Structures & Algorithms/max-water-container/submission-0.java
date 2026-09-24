class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        // int premax[] = new int[n];
        // int suffmax[] = new int[n];
        // premax[0] = heights[0];
        // suffmax[n-1] = heights[n-1];
        // for(int i = 1; i<n; i++){
        //     premax[i] = Math.max(premax[i-1] , premax[i]);
        // }
        // for(int i = n-2; i>=0; i--){
        //     suffmax[i] = Math.max(suffmax[i+1] , suffmax[i]);
        // }
        // ans = 0;
        // for(int i = 0; i<n; i++){
        //     ans = Math.max(ans , )
        // }
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j){
            ans = Math.max(ans , (j-i)* Math.min(arr[j] , arr[i]));
            if(arr[i] < arr[j]) i++;
            else j--;
        }
        return ans;
    }
}

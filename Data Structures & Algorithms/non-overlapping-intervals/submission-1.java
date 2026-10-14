class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr , (a , b) -> Integer.compare(a[1] , b[1]));
        int ans = 1;
        int last = arr[0][1];
        for(int i = 1; i<arr.length; i++){
            if(arr[i][0] >= last){
             ans++;
             last = arr[i][1];
            }
        }
        return arr.length-ans;
    }
}

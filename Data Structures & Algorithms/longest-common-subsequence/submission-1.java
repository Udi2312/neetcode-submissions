class Solution {
    public int lcs(String s1, String s2, int i , int j, int dp[][]){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1)  return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1 + lcs(s1,s2,i-1,j-1,dp);
        else{
            return dp[i][j] = Math.max(lcs(s1,s2,i-1,j,dp) , lcs(s1,s2,i,j-1,dp));
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int dp[][] = new int[s1.length()][s2.length()];
        for(int arr[] : dp) Arrays.fill(arr , -1);
        return lcs(s1 , s2, s1.length()-1 , s2.length()-1, dp);
    }
}

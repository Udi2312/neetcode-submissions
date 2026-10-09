class Solution {
    public int helper(int[] coins, int amount, int i){
        if(amount == 0) return 0;
        if(i == coins.length) return Integer.MAX_VALUE;
        if(amount < 0) return Integer.MAX_VALUE;
        int take = helper(coins , amount-coins[i], i);
        if(take != Integer.MAX_VALUE) {
            take++;
        }
        int skip = helper(coins , amount, i+1);
        return Math.min(take , skip);

    }
    public int coinChange(int[] coins, int amount) {
        int ans = helper(coins , amount , 0);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}

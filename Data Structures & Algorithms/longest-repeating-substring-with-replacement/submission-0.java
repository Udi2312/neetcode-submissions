class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int l = 0;
        int ans = 0;
        int maxf = 0;
        for(int r = 0; r<s.length(); r++){
            freq[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf , freq[s.charAt(r) - 'A']);
             
            while(k < r-l+1-maxf){
                freq[s.charAt(l) - 'A']--;
                l++; 
            }
            ans = Math.max(ans , r-l+1);
        }
        return ans;
    }
}

class Solution {
    public boolean isSubstring(String s , int i , int j){
        if(i >= j) return true;
        if(s.charAt(i) == s.charAt(j)) return isSubstring(s , i+1, j-1);
        else return false;
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                if(isSubstring(s , i, j)){
                    if(ans.length() < j-i+1) ans = s.substring(i ,j+1);
                }
            }
        }
        return ans;
    }
}

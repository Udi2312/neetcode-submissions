class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("\\s+", "");
        String n = a.toLowerCase();
        int i = 0;
        int j = n.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(n.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(n.charAt(j))){
                j--;
                continue;
            }
            if(n.charAt(i) == n.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}

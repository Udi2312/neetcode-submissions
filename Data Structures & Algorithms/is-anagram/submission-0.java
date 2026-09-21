class Solution {
    public boolean isAnagram(String s, String t) {
        char[] snew = s.toCharArray();
        char[] tnew = t.toCharArray();
        Arrays.sort(tnew);
        Arrays.sort(snew);
        String s2 = new String(snew);
        String t2 = new String(tnew);
        return s2.equals(t2);
    }
}

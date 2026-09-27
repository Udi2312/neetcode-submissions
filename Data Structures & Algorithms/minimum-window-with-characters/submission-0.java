class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            mp.put(t.charAt(i) , mp.getOrDefault(t.charAt(i), 0) +1);
        }

        int l = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (mp.containsKey(c)) {
                if (mp.get(c) > 0) {
                    count--;
                }
                mp.put(c, mp.get(c) - 1);
            }
            while (count == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                char left = s.charAt(l);
                if (mp.containsKey(left)) {
                    mp.put(left, mp.get(left) + 1);
                    if (mp.get(left) > 0) {
                        count++;
                    }
                }
                l++;
            }
        }
         if(minLen == Integer.MAX_VALUE) return "";
        else return s.substring(start, start + minLen);
    }
}

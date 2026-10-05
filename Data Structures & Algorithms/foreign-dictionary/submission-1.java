class Solution {
    public String foreignDictionary(String[] words) {
        List<List<Integer>> adj = new ArrayList<>();
        int inde[] = new int[26];
        for(int i = 0; i<26; i++) adj.add(new ArrayList<>());
         boolean[] present = new boolean[26];

        for(String word : words) {
            for(char ch : word.toCharArray()) {
                present[ch - 'a'] = true;
            }
        }

        for(int i = 0; i<words.length-1; i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(), s2.length());
            int k = 0;
            while(k < len && s1.charAt(k) == s2.charAt(k)) {
                k++;
            }
            if(k == len) {
                if(s1.length() > s2.length()) {
                    return "";
                }
                continue;
            }
            int f = s1.charAt(k) - 'a';
            int s = s2.charAt(k) - 'a';
            adj.get(f).add(s);
            inde[s]++;
        }
        int total = 0;
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder("");
         for(int i = 0; i < 26; i++) {
            if(present[i]) {
                total++;
                if(inde[i] == 0) {
                    q.add(i);
                }
            }
        }
        while(q.size() > 0){
            int front = q.remove();
            sb.append( (char)(front + 'a'));
            for(int e : adj.get(front)){
                inde[e]--;
                if(inde[e] == 0) q.add(e);
            }
        }
        if(sb.length() != total) {
            return "";
        }
        return sb.toString();
    }
}

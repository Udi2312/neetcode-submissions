class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for(int i : arr){
            st.add(i);
        }
        int ct = 0;
        int ans = 0;
        for(int e : st){
            if(st.contains(e-1)) continue;
            else{
                ct++;
                e++;
                while(st.contains(e)){
                    e++;
                    ct++;
                }
                ans = Math.max(ans,ct);
                ct = 0;
            }
        }
        return ans;
    }
}

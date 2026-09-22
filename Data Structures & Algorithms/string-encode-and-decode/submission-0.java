class Solution {

    public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder("");
        for(String s : strs){
            int l = s.length();
            en.append(l+"");
            en.append("#");
            en.append(s);
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') j++;
            int l = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+1+l);
            ans.add(s);
            i = j+1+l;
        }
        return ans;
    }
}

class Solution {
    public void bfs(List<List<Integer>> ans, boolean[] vis, int idx){
        vis[idx] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while(q.size() > 0){
            int front = q.remove();
            for(int l : ans.get(front)){
                    if(!vis[l]){
                        vis[l] = true;
                        q.add(l);
                    }
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++) ans.add(new ArrayList<>());
        for(int[] e : edges){
            ans.get(e[0]).add(e[1]);
            ans.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[n];
        int a = 0;
        for(int i = 0; i<n; i++){
            if(!vis[i]){
            bfs(ans,vis,i);
            a++;
            }
        }
        return a;
    }
}

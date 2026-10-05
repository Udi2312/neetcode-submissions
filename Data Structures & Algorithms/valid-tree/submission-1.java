class Solution {
    class Pair{
        int n;
        int p;
        Pair(int n , int p){
            this.n = n;
            this.p = p;
        }
    }
    public boolean validTree(int n1, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n1; i++) adj.add(new ArrayList<>());
        for(int e[] : edges){
        adj.get(e[0]).add(e[1]);
        adj.get(e[1]).add(e[0]);
        }
        boolean vis[] = new boolean[n1];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,-1));
        while(q.size() > 0){
            Pair front = q.remove();
            int n = front.n;
            int p = front.p;
            if(vis[n]) return false;
            vis[n] = true;
            for(int e : adj.get(n)){
             if(e != p){
                if(!vis[e])
                q.add(new Pair(e,n));
            }
        }
        }
        for(boolean f : vis) if(!f) return false;
        return true;
    }
}

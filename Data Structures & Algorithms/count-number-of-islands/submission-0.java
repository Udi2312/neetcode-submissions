class Solution {
    class Pair{
        int r;
        int c;
        Pair(int r , int c){
            this.r = r;
            this.c = c;
        }
    }
    public void bfs(char[][] grid, boolean[][] vis, int i , int j){
        vis[i][j] = true;
         int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        while(q.size() > 0){
            Pair p = q.remove();
            int r = p.r;
            int c = p.c;
            if(r>0){
                if(grid[r-1][c] == '1' && !vis[r-1][c]){
                    q.add(new Pair(r-1,c));
                    vis[r-1][c] = true;
                }     
            }
            if(c>0){
                if(grid[r][c-1] == '1' && !vis[r][c-1]){
                    q.add(new Pair(r,c-1));
                    vis[r][c-1] = true;
                }     
            }
            if(r+1 < m){
                if(grid[r+1][c] == '1' && !vis[r+1][c]){
                    q.add(new Pair(r+1,c));
                    vis[r+1][c] = true;
                }     
            }
            if(c+1<n){
                if(grid[r][c+1] == '1' && !vis[r][c+1]){
                    q.add(new Pair(r,c+1));
                    vis[r][c+1] = true;
                }     
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    ans++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return ans;
    }
}

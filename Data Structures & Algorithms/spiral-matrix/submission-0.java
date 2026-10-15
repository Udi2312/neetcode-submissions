class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int tr = 0;
        int br = m-1;
        int lc = 0;
        int rc = n-1;
        int tot = 0;
        while(tr <= br && lc <= rc && tot < m*n){
            if(tot < m*n){
            for(int i = lc; i<=rc; i++){
                ans.add(matrix[tr][i]);
                tot++;
            }
            tr++;
            }

            if(tot < m*n){
            for(int i = tr; i<=br; i++){
                ans.add(matrix[i][rc]);
                tot++;
            }
            rc--;
            }

            if(tot < m*n){
            for(int i = rc; i>=lc; i--){
                ans.add(matrix[br][i]);
                tot++;
            }
            br--;
            }

            if(tot < m*n){
            for(int i = br; i>=tr; i--){
                ans.add(matrix[i][lc]);
                tot++;
            }
            lc++;
            }
        }
        return ans;
    }
}

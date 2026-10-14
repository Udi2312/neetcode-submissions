class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ans.add(new int[]{arr[0][0] , arr[0][1]});
        for(int i = 1; i<arr.length; i++){
            if(ans.get(ans.size()-1)[1] > arr[i][0]){
                ans.get(ans.size()-1)[0] = Math.min(ans.get(ans.size()-1)[0] , arr[i][0]);
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1] , arr[i][1]);
            }
            else{
                ans.add(new int[]{arr[i][0] , arr[i][1]});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public boolean canAttendMeetings(List<Interval> adj) {
        if(adj.size() == 0) return true;
        int arr[][] = new int[adj.size()][2];
        for(int i = 0; i<adj.size(); i++){
            arr[i][0] = adj.get(i).start;
            arr[i][1] = adj.get(i).end;
        }
        return merge(arr).length == adj.size();
    }
}

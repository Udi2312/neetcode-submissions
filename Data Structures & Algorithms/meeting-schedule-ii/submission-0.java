/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int arr[][] = new int[intervals.size() * 2][2];
        int k = 0;
        for(int i = 0; i<intervals.size(); i++){
            arr[k][0] = intervals.get(i).start;
            arr[k][1] = 1;
            k++;
        }
        for(int i = 0; i<intervals.size(); i++){
            arr[k][0] = intervals.get(i).end;
            arr[k][1] = -1;
            k++;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return Integer.compare(a[0], b[0]);
        });
        int currsum = 0;
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            currsum += arr[i][1];
            ans = Math.max(ans , currsum);
        }
        return ans;
    }
}

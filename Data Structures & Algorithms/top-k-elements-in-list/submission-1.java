class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int ans[] = new int[k];
       int n = nums.length;
       HashMap<Integer, Integer> mp = new HashMap<>();
       for(int i = 0; i<n; i++){
        mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1);
       }
       Integer[] arr = mp.keySet().toArray(new Integer[0]);
       Arrays.sort(arr , (a,b) -> Integer.compare(mp.get(b) , mp.get(a)));
       for(int i = 0; i<k; i++){
        ans[i] = arr[i];
       }
       return ans;
    }
}

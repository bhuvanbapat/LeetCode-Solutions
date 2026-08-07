class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int runningsum = 0, count = 0;

        for (int num : nums) {
            runningsum += num;

            int required = runningsum - goal;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(runningsum, map.getOrDefault(runningsum, 0) + 1);

        }
        return count;
    }
}
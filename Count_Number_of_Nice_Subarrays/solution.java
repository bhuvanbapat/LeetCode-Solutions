class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int runningSum = 0;
        int count = 0;

        for (int num : nums) {
            runningSum += num % 2;
            count += map.getOrDefault(runningSum - k, 0);
            map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
        }

        return count;
    }
}
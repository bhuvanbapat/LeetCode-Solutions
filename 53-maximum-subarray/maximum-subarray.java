class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int num : nums) {
            maxsum = Math.max((sum += num), maxsum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}
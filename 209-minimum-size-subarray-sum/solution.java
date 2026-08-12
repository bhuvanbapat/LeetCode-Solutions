class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int r = 0;
        int count = 0;
        int minL = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            r += nums[right];
            while (r >= target) {
                count = right - left + 1;
                r -= nums[left];
                left++;
                minL = Math.min(minL, count);
            }      
        }
        if (minL == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minL;
        }
    }
}
class Solution {
    public int findMiddleIndex(int[] nums) {
        int ts=0;
        int left = 0;
        int right;
        for (int i = 0; i < nums.length; i++) {
            ts += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            right = ts - nums[i] - left;
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int currentmin = nums[0];
        int currentmax = nums[0];
        int globalbest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int bp = Math.max(nums[i], Math.max(currentmin * nums[i], currentmax * nums[i]));
            int wp = Math.min(nums[i], Math.min(currentmin * nums[i], currentmax * nums[i]));
            currentmax = bp;
            currentmin = wp;
            globalbest = Math.max(globalbest, currentmax);
        }
        return globalbest;
    }
}
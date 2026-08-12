class Solution {
    public int longestOnes(int[] nums, int k) {
        int zc = 0;
        int left = 0;
        int max_zc = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zc++;
            }
            while (zc > k) {
                if (nums[left] == 0) {
                    zc--;
                }
                left++;
            }
            max_zc = Math.max(max_zc, right - left + 1);
        }
        return max_zc;
    }
}
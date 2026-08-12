class Solution {
    public int[] runningSum(int[] nums) {

        int[] rs = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                rs[i] = nums[i];
            } else {
                rs[i] = rs[i - 1] + nums[i];
            }
        }
        return rs;
    }
}
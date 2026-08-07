class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rs = 0;
        int ls = 0;
        int ts = 0;
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            ts += nums[i];

        for (int i = 0; i < nums.length; i++) {
            rs = ts - nums[i] - ls;
            a[i] = Math.abs(ls - rs);
            ls += nums[i];
        }
        return a;
    }

}

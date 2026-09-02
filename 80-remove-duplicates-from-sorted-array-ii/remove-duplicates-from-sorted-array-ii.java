class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 2;
        if (nums.length <= 2)
            return nums.length;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
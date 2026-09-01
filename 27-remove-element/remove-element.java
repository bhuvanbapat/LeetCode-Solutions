class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                while (j >= 0 && nums[j] == val) {
                    j--;
                }
                if (i <= j) {
                    nums[i] = nums[j];
                    j--;
                }
            } else {
                i++;
            }
        }
        return j + 1;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0) {
            return;
        }
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        k = k % nums.length;
        left = 0;
        right = k - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = k;
        right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
return;
    }
}
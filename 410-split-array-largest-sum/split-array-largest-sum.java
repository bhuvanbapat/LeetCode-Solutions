class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            if (num > left) {
                left = num;
            }
            right += num;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            int parts = 1;
            for (int num : nums) {
                if (sum + num <= mid) {
                    sum += num;
                } else {
                    parts++;
                    sum = num;
                }
            }
            if (parts > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

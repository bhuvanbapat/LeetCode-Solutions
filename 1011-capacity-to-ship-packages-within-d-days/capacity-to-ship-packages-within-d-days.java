class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int num : weights) {
            left = Math.max(left, num);
            right += num;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int loading = 0;
            int dayscheck = 1;
            for (int num : weights) {
                if (loading + num <= mid) {
                    loading += num;
                } else {
                    loading = num;
                    dayscheck++;
                }
            }
            if (dayscheck <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
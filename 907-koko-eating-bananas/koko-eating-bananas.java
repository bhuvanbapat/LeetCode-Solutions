class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int num : piles) {
            right = Math.max(right, num);
        }
        while (left < right) {
            int hours = 0;
            int k = left + (right - left) / 2;
            for (int num : piles) {
                int q = num / k;
                if (num % k != 0) {
                    q++;
                }
                hours += q;
            }
            if (hours <= h) {
                right = k;
            } else {
                left = k + 1;
            }
        }
        return left;
    }
}
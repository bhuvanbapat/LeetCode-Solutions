class Solution {

    private int l(int[] nums, int target) {
        int left, right, mid, answer1 = -1;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer1 = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer1;
    }

    private int r(int[] nums, int target) {
        int left, right, mid, answer2 = -1;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer2 = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return answer2;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[] { l(nums, target), r(nums, target) };
    }
}
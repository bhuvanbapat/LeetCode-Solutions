class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int bestsum = nums[0] + nums[1] + nums[2];
        int currentsum = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                currentsum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - currentsum) < Math.abs(target - bestsum)) {
                    bestsum = currentsum;

                }  if (currentsum < target) {
                    left++;

                } else if (currentsum > target) {
                    right--;
                }

                else {
                    return currentsum;

                }

            }

        }

        return bestsum;
    }
}
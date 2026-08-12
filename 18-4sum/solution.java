class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                long remaining_target = (long) target - nums[i] - nums[j];

                while (left < right) {
                    long current_value = (long) nums[left] + nums[right];

                    if (current_value < remaining_target) {
                        left++;
                    } else if (current_value > remaining_target) {
                        right--;
                    } else {
                        ans.add(List.of(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    }
                }
            }

        }

        return ans;

    }
}
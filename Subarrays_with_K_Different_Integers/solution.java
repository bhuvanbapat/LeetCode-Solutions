class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int distinct = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {

            int curr = nums[right];
            int freq = map.getOrDefault(curr, 0) + 1;
            map.put(curr, freq);

            if (freq == 1) {
                distinct++;
            }

            while (distinct > k) {

                int leftNum = nums[left];
                freq = map.get(leftNum) - 1;
                map.put(leftNum, freq);

                if (freq == 0) {
                    map.remove(leftNum);
                    distinct--;
                }

                left++;
            }

            answer += right - left + 1;
        }

        return answer;
    }
}
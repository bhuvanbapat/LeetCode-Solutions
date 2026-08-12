class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum += num;

            int required = sum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }
}
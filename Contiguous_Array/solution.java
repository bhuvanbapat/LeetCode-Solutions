class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlength = 0;
        map.put(0, -1);
        int runningsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                runningsum--;
            } else {
                runningsum++;
            }

            if (map.containsKey(runningsum)) {
                int length = i - map.get(runningsum);
                maxlength = Math.max(maxlength, length);
            } else {
                map.put(runningsum, i);
            }

        }
        return maxlength;
    }
}
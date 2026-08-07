class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }

        int answer = 0;

        for (int c : nums3) {
            for (int d : nums4) {
                answer += map.getOrDefault(-(c + d), 0);
            }
        }

        return answer;
    }
}
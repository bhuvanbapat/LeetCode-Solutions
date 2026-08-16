class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        s.push(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            while (!s.isEmpty() && nums2[i] > s.peek()) {
                map.put(s.peek(), nums2[i]);
                s.pop();
            }
            s.push(nums2[i]);
        }
        while (!s.isEmpty()) {
            map.put(s.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
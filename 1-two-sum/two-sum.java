class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        int i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < nums.length; i++) {
            a=nums[i];
            b = target -a;
            if (map.containsKey(b)) {
                return new int[]{map.get(b),i};
            }
            map.put(a,i);
        }
       return new int[]{-1,-1};

    }
}
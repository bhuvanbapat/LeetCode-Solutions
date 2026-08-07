class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : set) {
            int current = num;
            int length = 1;
            if (!set.contains(current - 1)) {
                    while(set.contains(current+1)){
                        current++;
                length++;
                    }
                 maxLength=Math.max(maxLength,length);
            }
          
        }
        return maxLength;
    }
}
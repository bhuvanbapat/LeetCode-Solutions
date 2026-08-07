class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentstreak = 0;
        int maxstreak = 0;
        for (int num : nums) {
            if (num == 1) {
                currentstreak++;
                maxstreak = Math.max(currentstreak, maxstreak);
            }
            else{
                currentstreak = 0;
            }
        }
        return maxstreak;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxsum =0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
}
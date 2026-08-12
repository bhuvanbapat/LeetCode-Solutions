class Solution {
    public int largestAltitude(int[] gain) {
        int rs = 0;
        int maxrs = 0;

        for (int num : gain) {
            rs += num;
            maxrs = Math.max(maxrs, rs);
        }
        return maxrs;
    }
}
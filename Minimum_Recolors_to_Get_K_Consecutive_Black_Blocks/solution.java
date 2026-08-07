class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int localmin = 0;
        int globalmin = Integer.MAX_VALUE;

        for (int right = 0; right < blocks.length(); right++) {

            if (blocks.charAt(right) == 'W') {
                localmin++;
            }

            if (right - left + 1 == k) {
                globalmin = Math.min(globalmin, localmin);
                if (blocks.charAt(left) == 'W') {
                    localmin--;
                }
                left++;
            }
        }
        return globalmin;
    }
}
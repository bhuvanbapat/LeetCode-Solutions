class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int vowelcount = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char cr=s.charAt(right);
            if (cr=='a'||cr=='e'||cr=='i'||cr=='o'||cr=='u') {
                vowelcount++;
            }
            while ((right - left + 1) > k) {
                char cl=s.charAt(left);
                if (cl=='a'||cl=='e'||cl=='i'||cl=='o'||cl=='u')  {
                    vowelcount--;
                }
                left++;
            }
            if (right - left + 1 == k) {
                max = Math.max(max, vowelcount);
            }
        }
        return max;
    }
}
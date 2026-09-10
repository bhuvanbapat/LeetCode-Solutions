class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int ans=0;
        while (num >= 10) {
            ans = 0;
            while (num > 0) {
                int digit = num % 10;
                num = num / 10;
                ans += digit;
            }
            num = ans;
        }
        return ans;
    }
}
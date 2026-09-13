class Solution {
    public int climbStairs(int n) {
        return ways(n);
    }

    private int ways(int n) {
        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        int w1 = 1; // ways(1)
        int w2 = 2; // ways(2)

        for (int i = 3; i <= n; i++) {
            int current = w1 + w2;

            w1 = w2;
            w2 = current;
        }

        return w2;
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> b = new ArrayList<>();
            b.add(1);
            if (i > 0) {
                List<Integer> previous = a.get(i - 1);
                for (int j = 1; j < i; j++) {
                    b.add(previous.get(j - 1) + previous.get(j));
                }
                b.add(1);
            }
            a.add(b);
        }
        return a;
    }
}
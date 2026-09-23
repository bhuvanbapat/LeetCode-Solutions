class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> previous = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> b = new ArrayList<>();
            b.add(1);
            if (i > 0) {
                for (int j = 1; j < i; j++) {
                    b.add(previous.get(j - 1) + previous.get(j));
                }
                b.add(1);
            }
            previous = b;
        }
        return previous;
    }
}
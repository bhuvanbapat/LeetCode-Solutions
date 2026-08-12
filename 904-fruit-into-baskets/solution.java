class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int answer = 0;
        int distinct = 0;

        for (right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            if (map.get(fruits[right]) == 1) {
                distinct++;
            }

            while (distinct > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                    distinct--;
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);

        }
        return answer;
    }
}
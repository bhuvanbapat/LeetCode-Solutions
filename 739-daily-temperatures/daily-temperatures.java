class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int temp = 0; temp < temperatures.length; temp++) {
            while (!stack.isEmpty() && temperatures[temp] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = temp - index;
            }
            stack.push(temp);
        }
        return answer;
    }
}
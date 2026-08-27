class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currheight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] >= currheight) {
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = i - left - 1;
                maxarea = Math.max(maxarea, width * height);
            }

            if (i < heights.length) {
                stack.push(i);
            }
        }

        return maxarea;
    }
}
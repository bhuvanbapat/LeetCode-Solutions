class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        int area = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currheight;
            if (i == heights.length) {
                currheight = 0;
            } else {
                currheight = heights[i];
            }
            while (!stack.isEmpty() && heights[stack.peek()] >= currheight) {
                int left = 0;
                int height = heights[stack.pop()];
                if (stack.isEmpty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }
                int width = i - left - 1;
                area = width * height;
                maxarea = Math.max(area, maxarea);
            }
            if (i < heights.length) {
                stack.push(i);
            }
        }
        return maxarea;
    }
}
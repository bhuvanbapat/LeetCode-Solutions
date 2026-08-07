class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {
            int current_height = Math.min(height[left], height[right]);
            int width = right - left;
            int area = current_height * width;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }
}
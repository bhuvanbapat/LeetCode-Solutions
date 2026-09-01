class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
int maxL=0;
int maxR=0;
int water=0;
        while(i<j){
            maxL=Math.max(maxL,height[i]);
            maxR=Math.max(maxR,height[j]);
            if(maxL<=maxR){
                water+=maxL-height[i];
                i++;
            }else{
                water+=maxR-height[j];
                j--;
            }
        }
    return water;}
}
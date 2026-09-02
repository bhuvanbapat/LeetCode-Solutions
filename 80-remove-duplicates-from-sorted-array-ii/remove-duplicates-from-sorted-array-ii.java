class Solution {
    public int removeDuplicates(int[] nums) {
        int j=2;
        if(nums.length==2) return 2;
        if(nums.length==1) return 1;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i]; 
                j++;
        }}
    return j;
    }
}
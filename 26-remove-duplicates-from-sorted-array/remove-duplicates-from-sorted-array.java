class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
if(nums.length==1){
    return 1;
}
while(i<nums.length){  
    if(nums[i]!=nums[i-1]){
        nums[j]=nums[i];
        i++;j++;
    }else{
        i++;
    }
}
return j;
    }
}
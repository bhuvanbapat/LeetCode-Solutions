class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        if(nums.length==1){
            return nums;
        }
        while(i<nums.length){
            
            if(nums[i]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            i++;
            j++;
            }
            else{
                i++;
            }
        }
    return nums;}
}
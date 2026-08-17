/*
class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int leftSum=0,rightSum=0;

            for(int j=0;j<i;j++){
                leftSum+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rightSum+=nums[k];
            }
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}
*/


class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }

        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum)
                return i;
            else
                leftSum+=nums[i];
        }

        return -1;
    }
}

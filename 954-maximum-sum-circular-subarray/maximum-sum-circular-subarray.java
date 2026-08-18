class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gobalMax=nums[0],gobalMin=nums[0],currentMax=0,currentMin=0,total=0;
        for(int i=0;i<nums.length;i++){
            currentMax=Math.max(nums[i],currentMax+nums[i]);
            gobalMax=Math.max(gobalMax,currentMax);

            currentMin=Math.min(nums[i],currentMin+nums[i]);
            gobalMin=Math.min(gobalMin,currentMin);

            total=total+nums[i];
        }

        if(gobalMax>0)
            return Math.max(gobalMax,total-gobalMin); // circular sum kosam total-gobalMin
        else 
            return gobalMax; 
    }
}
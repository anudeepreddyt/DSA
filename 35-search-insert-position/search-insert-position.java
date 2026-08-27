class Solution {
    public int searchInsert(int[] nums, int target) {
        

        return foundTarget(nums,0,nums.length-1,target);

    }

    public int foundTarget(int[] nums,int left,int right,int target){
        
        while(left<=right){
        int mid=left+(right-left)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]<target){
            left=mid+1;
            return foundTarget(nums,left,right,target);
        }

        if(nums[mid]>target){
            right=mid-1;
            return foundTarget(nums,left,right,target);
        }

        }
        return left;

    }

}
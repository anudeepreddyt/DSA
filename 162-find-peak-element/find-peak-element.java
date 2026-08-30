class Solution {

    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid] > nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}

/*
// for cal peak element in right side
class Solution{
    public int findPeakElement(int[] nums){
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=left+(right-left+1)/2; //+1 is used to get of out TLE and point to second mid after one

            if(nums[mid]>nums[mid-1]){
                left=mid;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}
*/
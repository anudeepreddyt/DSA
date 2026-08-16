
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        int count=Integer.MAX_VALUE,sum=0,left=0;

        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            
            while(sum>=target){
                count=Math.min(count,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(count==Integer.MAX_VALUE)
            return 0;

        return count;
    }
}




/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE,sum=0;

        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>=target){
                    ans=Math.min(ans,j-i+1);
                    break;
                }
            }
            
        }
        if(ans==Integer.MAX_VALUE)
            return 0;

        return ans;
    }
}

*/
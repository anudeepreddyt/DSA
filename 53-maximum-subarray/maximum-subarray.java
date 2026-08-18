class Solution {
    public int maxSubArray(int[] nums) {
         int max_sum=Integer.MIN_VALUE,sum=0;

         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum=Math.max(max_sum,sum);
            if(sum<0){
                sum=0;
            }
         }
         return max_sum;
    }
}

/*
class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                    sum+=nums[j];
                    max_sum=Math.max(max_sum,sum);
            }
            
        }
        return max_sum;
    }
}
*/
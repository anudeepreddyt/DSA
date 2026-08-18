class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int current_max=0;
       int current_min=0;
       int max_sum=0;
       int min_sum=0;
       int answer=0;
       for(int i=0;i<nums.length;i++){
        current_max=Math.max(nums[i],current_max+nums[i]);
        max_sum=Math.max(max_sum,current_max);

        current_min=Math.min(nums[i],current_min+nums[i]);
        min_sum=Math.min(min_sum,current_min);

        answer=Math.max(max_sum,Math.abs(min_sum));

       }
       return answer;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
      int prefix_product=1,suffix_product=1,max_product=Integer.MIN_VALUE;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(prefix_product==0) prefix_product=1;
        if(suffix_product==0) suffix_product=1;

        prefix_product*=nums[i];
        suffix_product*=nums[n-i-1];

        max_product=Math.max(max_product,Math.max(prefix_product,suffix_product));
      }
      return max_product;
    }
}
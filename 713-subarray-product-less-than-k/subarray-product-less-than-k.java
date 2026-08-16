class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int j=0,product=1,arrayCount=0,n=nums.length;

        for(int i=0;i<n;i++){
            j=i;
            product=1;
            while(j<n){
                product=nums[j]*product;
                if(product<k){
                    arrayCount++;
                    j++;
                }
                else
                    break;
            }
        }
        return arrayCount;
    }
}
class Solution{
    public int numSubarrayProductLessThanK(int[] nums,int k){
        if(k<=1) return 0;

        int left=0,product=1,count=0;

        for(int right=0;right<nums.length;right++){
            product=product*nums[right];

            while(product>=k){
                product=product/nums[left];
                left++;
            }
            count=count+(right-left+1);
        }
        return count;
    }
}



/* class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k<=1) return 0;
        
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
} */

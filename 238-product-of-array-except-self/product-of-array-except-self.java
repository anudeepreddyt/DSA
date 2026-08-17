class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;

       int[] result=new int[n];
       result[0]=1;

       for(int i=1;i<n;i++){
        result[i]=result[i-1]*nums[i-1];
       }

       int rightProduct=1;
       for(int i=n-1;i>=0;i--){
        result[i]=rightProduct*result[i];
        rightProduct*=nums[i];
       }
       return result;
    }
}

/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int leftProduct=1;
            int rightProduct=1;
            int finalProduct=1;
            for(int j=0;j<i;j++){
                leftProduct*=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rightProduct*=nums[k];
            }
            finalProduct=leftProduct*rightProduct;
            result[i]=finalProduct;
        }
        return result;
    }
}
*/
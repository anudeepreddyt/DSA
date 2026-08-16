class Solution {
    public int trap(int[] height) {

       int n=height.length;
       int water=0;
       int left=0,right=n-1;
       int leftMax=height[left],rightMax=height[right];


        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,height[left]);
                water=water+leftMax-height[left];
            }
            else{
                right--;
                rightMax=Math.max(rightMax,height[right]);
                water=water+rightMax-height[right];
            }
        }

        return water;


    }
}
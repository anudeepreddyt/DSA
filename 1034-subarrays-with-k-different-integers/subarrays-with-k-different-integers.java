class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMost(nums,k)-atMost(nums,k-1);
    }

    public int atMost(int[] nums,int k){
        int count=0,left=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                    map.remove(nums[left]);
                left++;
            }
            count=count+(i-left+1);
        }
        return count;
    }
}


/*
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count=0;


        for(int i=0;i<nums.length;i++){
           
            for(int j=i;j<nums.length;j++){
            HashMap<Integer,Integer> map=new HashMap<>();
               for(int z=i;z<=j;z++){
                map.put(nums[z],map.getOrDefault(nums[z],0)+1);
               }
               if(map.size()==k)
                    count++;
            }
           
        }
        return count;
    }
}
*/
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int count=0,prefixsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int num:nums){
            prefixsum+=num;
            int reminder = prefixsum%k;
            if(reminder<0)
                reminder+=k;
            if(map.containsKey(reminder)){
                count+=map.get(reminder);
            }
            map.put(reminder,map.getOrDefault(reminder,0)+1);


        }
        return count;
    }
}

/*
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum%k==0)
                    count++;
            }
        }
        return count;
    }
}
*/
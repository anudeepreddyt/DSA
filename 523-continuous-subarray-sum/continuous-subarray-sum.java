class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int reminder=prefixSum%k;
            if(map.containsKey(reminder))
            {
                if(i-map.get(reminder) >= 2)
                    return true;
            }
            else{
            map.put(reminder,i);
            }
        }
        return false;
    }
}

/*
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (j - i + 1 >= 2 && sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
*/
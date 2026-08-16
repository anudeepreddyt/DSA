class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> deque=new LinkedList<>();

        for(int right=0;right<n;right++){

            while(!deque.isEmpty() && deque.peekFirst() <= right -k){
                    deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]){
                deque.pollLast();
            }

            deque.addLast(right);
            if(right >= k-1){
                result[right-k+1] = nums[deque.peekFirst()];
            }
        }
        
        return result;


    }
}


/*
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            list.add(max);
        }
        return list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();

        
    }
}

*/
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long maxSum = 0;
        long sum = 0;

        for (int right = 0; right < n; right++) {

            sum = sum + nums[right];

            map.put(
                nums[right],
                map.getOrDefault(nums[right], 0) + 1
            );

            if (right - left + 1 > k) {

                sum = sum - nums[left];

                map.put(
                    nums[left],
                    map.get(nums[left]) - 1
                );

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //not sorted array, return sum of 3 int closet to nums
        //only one solution 
        if (nums.length <3 || nums == null){
            return 0;
        }
        int result = 0;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0;  i < n; i++) {
            int j = i+1;
            int k = n-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if (sum == target){
                    return sum;
                }else if (sum<target) {
                    if (diff < min){
                        min = diff;
                        result = sum;
                    }
                    j++;
                }else{
                    if ( diff < min){
                        min = diff;
                        result = sum;
                    }
                    k--;
                }
            }
        }
        return result;
    }
}
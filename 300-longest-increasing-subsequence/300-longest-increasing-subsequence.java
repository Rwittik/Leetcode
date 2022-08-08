class Solution {
    public int lengthOfLIS(int[] nums) {
        int size =0, n = nums.length;
        int[] dp = new int[n+1];
        for (int i = 0; i<n; i++){
            int pos = binarySearch(dp, size, nums[i], nums);
            dp[pos] = nums[i];
            if(pos==size) size++;
        }
        return size;
    }
    
    private int binarySearch(int[] dp , int size, int target, int[] nums){
        int left = 0, right = size-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(dp[mid]<target) left= mid+1;
            else right = mid-1;
        }
        return left;
    }
}
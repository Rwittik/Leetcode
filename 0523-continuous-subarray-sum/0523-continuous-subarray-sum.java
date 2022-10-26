class Solution 
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        // [1] here, we store first seen indices for prefix sums (mod k);
        //    remainder 0 (when prefix sum equals k) is the only
        //    one that is allowed to occur just once, thus, we add 
        //    it to the map with index -1 (this won't break any logic)
        Map<Integer, Integer> prefix_rem = new HashMap<>(Map.of(0, -1));
        int prefix_sum = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            prefix_sum = (prefix_sum + nums[i]) % k;
            Integer j = prefix_rem.get(prefix_sum);

            // [2] check the condition, namely, that the difference
            //    between two occurences of the same remainder is >= 2
            if (j != null) {if (i - j > 1) return true;}
            else           prefix_rem.put(prefix_sum, i);
        }
        return false;
    }
}
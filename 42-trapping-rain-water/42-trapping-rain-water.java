class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,result=0;
        
        int max_left=0,max_right=0;
        while(left<right){
            max_left=Math.max(max_left,height[left]);
            max_right=Math.max(max_right,height[right]);
            if(max_left<max_right){
                result+=max_left-height[left];
                left++;
            }else{
                result+=max_right-height[right];
                right--;
            }
        }
        return result;
    }
}
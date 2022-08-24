// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m-1;
//         int j=n-1;
//         int k = m+n-1;
//         while(i>=0 && j>=0){
//             if(nums1[i]>nums2[j]){
//                 nums1[k] = nums1[i];
//                 i--;
//                 k--;
//             }else{
//                 nums1[k] = nums2[j];
//                 j--;
//                 k--;
//             }
//         }
//         while(j>=0){
//             nums1[k] = nums2[j];
//             k--;
//             j--;
//         }
//     }
// }
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            } 
            else{
                nums1[i--] = nums2[p2--];
            }
        }
       }
}
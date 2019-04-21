class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
              
        while(n > 0)  // when nums2 is done, we don't need to sort any more
            nums1[m + n - 1] = (m == 0 || nums2[n - 1] > nums1[m - 1]) ? nums2[--n] : nums1[--m]; 
            // when nums1 is done, all we need to do is put nums2 element
    }
}
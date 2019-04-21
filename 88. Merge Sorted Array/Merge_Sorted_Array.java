class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
              
        for(int i = 1; i <= n; ++i)
            nums1[m + i] = nums2[i - 1];

        for(int k = m + n; k > 0; --k)
            for(int j = 0; j < m + n; ++j)
            {
                int temp = 0;

                if(nums1[j] > nums1[j + 1])
                {
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }


    }
}

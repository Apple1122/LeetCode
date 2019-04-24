class Solution {
    public int[] twoSum(int[] num, int target) {
        
        int[] ans = new int[2];

        if (num == null || num.length < 2) 
            return ans;

        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int sum = num[left] + num[right];
            if (sum == target) 
            {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } 
            else if (sum > target) 
            {
                --right;
            } 
            else 
            {
                ++left;
            }
        }
        return ans;
    }
}
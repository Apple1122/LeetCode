class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // when find a number i, flip the number at position i-1 to negative. 
        // if the number at position i-1 is already negative, i is the number that occurs twice.

        List<Integer> ans = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; ++i)
        {
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0)
                ans.add(Math.abs(index) + 1);
            
            nums[index] = -nums[index];
        }

        return ans;

    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int num;
        
        for(int j = 0; j < numbers.length(); ++j)
        {
            num = target - numbers[0];

            for(int i = 0; i < numbers.length(); ++i)
            {

                if(num == numbers[i] && i  != j)
                    return new int[]{++j, ++i};
            }
        }
        return null;
    }
}
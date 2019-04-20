class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        // first: find the skyline from two side: top or bottom and left or right
        int[] top = new int[grid[0].length];
        int[] left = new int[grid.length];

        for(int i = 0; i < grid[0].length; ++i)
        {
            int max = 0;
            for(int j = 0; j < grid.length; ++j)  
            {
                // top[i] = Arrays.stream(grid[][i]).max().getAsInt();
                if(max < grid[j][i])
                    max = grid[j][i];
            }
            top[i] = max;
        }
        // System.out.println(Arrays.toString(top));
        
        for(int j = 0; j < grid.length; ++j)
        {
            left[j] = Arrays.stream(grid[j]).max().getAsInt();
        }
        // System.out.println(Arrays.toString(left));
        
        // second: compare 
        int sum = 0;

        for(int m = 0; m < grid.length; ++m)
            for(int n = 0; n < grid[0].length; ++n)
            {
                if(Math.min(left[m], top[n]) <= grid[m][n])
                    continue;
                else
                    sum += Math.min(left[m], top[n]) - grid[m][n];
            }
        
        
        return sum;

    }
}

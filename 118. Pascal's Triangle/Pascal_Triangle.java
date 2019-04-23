class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        int count = 0;       
        while(count < numRows)
        {
            list.add(0, 1);
            
            for(int i = 1; i < list.size() - 1; ++i)
            {
                list.set(i, list.get(i) + list.get(i + 1));
            }
            
            ans.add(new ArrayList<>(list));
            
            count++;
        }
        
        return ans;
    }
}
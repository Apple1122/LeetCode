class Solution {
    
    private List<Integer> ans = new ArrayList<Integer>();
    
    public List<Integer> getRow(int rowIndex) {
        

        ans.add(0, 1);
        
        for(int i = 1; i < ans.size() - 1; ++i)
            ans.set(i, ans.get(i) + ans.get(i + 1));
        
                if(rowIndex == 0)
            return ans;

        
        return getRow(--rowIndex);
    }
}
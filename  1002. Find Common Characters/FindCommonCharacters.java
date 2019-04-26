class Solution {
    public List<String> commonChars(String[] A) {
        
        List<String> ans = new ArrayList<String>();
       
        char[] firstStr = A[0].toCharArray();
        
        for(char s : firstStr)
        {
            boolean isCommon = true;
            
            for(int i = 1; i < A.length; ++i)
            {
                if(A[i].indexOf(s) != -1)
                {
                    A[i] = A[i].replaceFirst("" + s, "");
                }
                else
                {
                    isCommon = false;
                    break;
                }
                    
            }
            
            if(isCommon)
                ans.add("" + s);
        }
        return ans;
    }
}
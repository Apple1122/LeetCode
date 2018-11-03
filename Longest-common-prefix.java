class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0)
            return "";
        
        String ans = "";
        String tmp = strs[0];
        
        for(int i = 1; i < strs.length; i++)
        {
            ans = "";

            int round = Math.min(strs[i].length(), tmp.length());
            
            for(int j = 0; j < round; j++)
            {
                if(strs[i].charAt(j) == tmp.charAt(j))
                    ans += tmp.charAt(j);
                else
                    break;
                
            }
            tmp = ans; 
        }
        
        return tmp;
    }
}

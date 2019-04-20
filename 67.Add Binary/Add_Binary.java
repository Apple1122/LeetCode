class Solution {
    public String addBinary(String a, String b) {
      
        StringBuilder sb = new StringBuilder();
        
        int next = 0;
        int now = 0;
        
        
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;)
        {
            now = next;
            if(i >= 0)
                now += Character.getNumericValue(a.charAt(i--));
            if(j >= 0)
                now += Character.getNumericValue(b.charAt(j--));
            
            sb.append("" + now % 2);
            next = now / 2;
        }
        
        if(next != 0) 
            sb.append("" + next);
        
        return sb.reverse().toString();
    }
}

class Solution {
    public int mySqrt(int x) {

    // https://blog.csdn.net/lai_li/article/details/62221951
        long r = x;
        
        while (r*r > x)
            r = (r + x/r) / 2;
        
        return (int) r;
        
    }
}
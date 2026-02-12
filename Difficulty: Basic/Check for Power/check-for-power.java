// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int x, int y) {
        if (x == 1) return (y==1);
        
        while (y > 1){
            if (y%x != 0) return false;
            y/=x;
        }
        
        return true;
    }
}

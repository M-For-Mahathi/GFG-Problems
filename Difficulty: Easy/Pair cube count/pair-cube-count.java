// User function Template for Java

class Solution {
    static int pairCubeCount(int n) {
        int count = 0;
        
        for (int i = 1; i <= Math.cbrt(n); i++){
            int cube = i*i*i;
            int diff = n-cube;
            int cubediff = (int)Math.cbrt(diff);
            
            if (cubediff*cubediff*cubediff == diff) count++;
        }
        return count;
    }
};
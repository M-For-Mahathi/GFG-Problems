class Solution {
    public int lcm(int a, int b) {
        int sol = (a*b)/gcd(a,b);
        return sol;
    }
    
    static int gcd(int a, int b){
        return (b == 0) ? a : gcd(b, a%b);
    }
}
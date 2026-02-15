/*You are required to complete this function*/
class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        int n = (num1 * den2) + (num2 * den1);
        int d = (den1 * den2);
        int g = gcd(n, d);
        n /= g;
        d /= g;
        
        System.out.println
        (n + "/" + d);
    }
    
    int gcd(int a, int b){
        return (b==0) ? a : gcd(b, a%b);
    }
}
class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int rem = n / m;
        int down = m * rem;
        int up = (n*m) > 0 ? (m * (rem + 1)) : (m * (rem - 1));
        
        if (Math.abs (n - down) < Math.abs (n - up)) return down;
        else if (Math.abs (n-down) > Math.abs (n - up)) return up;
        else return Math.abs(down) > Math.abs(up) ? down : up;
    }
}
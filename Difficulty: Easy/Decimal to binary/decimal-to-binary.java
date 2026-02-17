class Solution {
    static String decToBinary(int n) {
        StringBuilder bin = new StringBuilder();
        
        while (n > 0){
            int bit = n % 2;
            bin.append((char)('0' + bit));
            n /= 2;
        }
        
        bin.reverse();
        
        return bin.toString();
    }
}
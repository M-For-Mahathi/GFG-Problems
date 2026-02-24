// User function Template for Java
class Solution {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        int max = 1000000;
        
        boolean[] prime = new boolean[max + 1];
        Arrays.fill(prime, true);
        
        prime[0] = prime[1] = false;
        
        for (int i = 2; i * i <= max; i++){
            if (prime[i]){
                for (int j = i*i; j <= max; j += i){
                    prime[j] = false;
                }
            }
        }
        
        int[] count = new int[max + 1];
        
        for (int i = 1; i <= max; i++){
            count[i] = count[i - 1];
            if (prime[i]) count[i]++;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (long n : query){
            int root = (int)Math.sqrt(n);
            ans.add(count[root]);
        }
        
        return ans;
    }
}
// User function Template for Java

class Sol {
    int divisibleBy11(String S) {
        int n = S.length();
        int oddDigSum = 0;
        int evenDigSum = 0;
        
        for (int i = 0; i < n; i++){
            int dig = S.charAt(i) - '0';
            
            if (i % 2 == 0){
                oddDigSum += dig;
            }else{
                evenDigSum += dig;
            }
        }
        
        if ((oddDigSum - evenDigSum) % 11 == 0) return 1;
        return 0;
    }
}
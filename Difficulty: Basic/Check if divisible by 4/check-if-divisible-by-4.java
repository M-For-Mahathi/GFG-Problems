// User function Template for Java

class Sol {
    int divisibleBy4(String n) {
        int len = n.length();
        int lastTwo;
        
        if (len == 1){
            lastTwo = n.charAt(0) - '0';
        }
        
        else{
            lastTwo = (n.charAt(len - 2) - '0') * 10 + (n.charAt(len - 1) - '0');
        }
        
        if (lastTwo % 4 == 0) return 1;
        return 0;
    }
}
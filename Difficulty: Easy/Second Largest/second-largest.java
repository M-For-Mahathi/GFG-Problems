class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1, secondLargest = -1;
        
        for (int n : arr){
            if (n > largest){
                secondLargest = largest;
                largest = n;
            }
            
            if (n < largest && n > secondLargest){
                secondLargest = n;
            }
        }
        
        return secondLargest;
    }
}
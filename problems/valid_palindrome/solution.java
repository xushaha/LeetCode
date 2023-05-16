class Solution {
    public boolean isPalindrome(String s) {
        //check if length < 2, if yes return true
       // if (s.length() < 2) {
       //     return true;
       // }
        
        //covert input string to lower case
        s = s.toLowerCase();
        
        //declare leftPointer = 0 and rightPointer = input string length - 1;
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        
        //while leftPointer < rightPointer
        while (leftPointer < rightPointer) {
            char left = s.charAt(leftPointer);
            char right = s.charAt(rightPointer);

            //if char At leftPointer is not Letter Or Digit leftPointer++ and continue;
            if (!Character.isLetterOrDigit(left)) {
                leftPointer++;
                continue;
            }
            //if char At rightPointer is not Letter Or Digit rightPointer-- and continue;
            if (!Character.isLetterOrDigit(right)) {
                rightPointer--;
                continue;
            }
            
            //if char At leftPointer is not equal to rightPointer, return false
            if (left != right) {
                return false;
            }
            //leftPointer++ and rightPointer--
            leftPointer++;
            rightPointer--;

        }
        //if false wasn't returned in loop, return true
        return true;
    }
}
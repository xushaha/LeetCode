class Solution {
    public int search(int[] nums, int target) {
        //declaring left pointer = 0 and right pointer = input array length -1
        int left = 0;
        int right = nums.length - 1;
        
        //making loop while left pointer <= right pointer
        while (left <= right) {
            //declaring mid pointer == (left + right) / 2
            int middle = (left + right) / 2;
            // check if target number equals to input array value at index = middle
            //if yes, return middle
            if (target == nums[middle]) {
                return middle;
            //if no, checking if target number less than input array value at index = middle     
            } else if (target < nums[middle]) {
                //if yes, moving right pointer to position middle - 1
                right = middle - 1;
            } else {
                //if no, moving left pointer to position middle + 1
                left = middle + 1;
            }
        }
        //if target wasn't found return -1
        return -1;

    }
}
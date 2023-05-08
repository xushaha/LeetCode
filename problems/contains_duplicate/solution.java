import java.util.Arrays;


class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet hS = new HashSet();
        for (int num : nums) {
            if (hS.contains(num)) {
                return true;
            }
            hS.add(num);
        }

    return false;
        
    }
}
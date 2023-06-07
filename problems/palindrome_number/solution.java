class Solution {
public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        List<Integer> digits = new ArrayList<>();

        while (x > 0) {
            digits.add(x % 10);
            x = x / 10;
        }


        System.out.println(digits);

        int left = 0;
        int right = digits.size() - 1;

        while (left <= right) {
           if (digits.get(left) != digits.get(right)) {
               return false;
           }
            left++;
            right--;
        }

        return true;

    }
}
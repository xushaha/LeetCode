class Solution {
    public int reverse(int x) {

        String[] input = (String.valueOf(x)).split("");
        String reverse = "";

        if (input[0].equals("-")) {
            reverse = "-";
            for (int i = input.length - 1; i >= 1; i--) {
                reverse += input[i];
            }

        } else {
            for (int i = input.length - 1; i >= 0; i--) {
                reverse += input[i];
            }
        }

        long result = Long.parseLong(reverse);

        if ((result < Math.pow(-2, 31)) || (result > (Math.pow(2, 31) - 1))) {
            return 0;
        }

        return (int) result;
        
    }
}
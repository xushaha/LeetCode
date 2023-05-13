class Solution {
    public boolean isValid(String s) {

        //create map where keys are closing brackets and values are opening brackets
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put(')', '(');
        symbols.put(']', '[');
        symbols.put('}', '{');

        //create stack
        Stack<Character> symbolsStack = new Stack<>();

        //go through input string by character
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);

            //check if map contains key that equal to charAt(i)
            if (symbols.containsKey(current)) {
                //if contains
                //1st check if stack is empty and value by key (charAt(i)) is equal to top of the stack
                if (!symbolsStack.isEmpty() && symbols.get(current).equals(symbolsStack.peek())) {
                    //then delete the top of the stack
                    symbolsStack.pop();
                //if conditions above isn't met, return false
                } else {
                    return false;
                }

            //if map doesn't contain key that equal to charAt(i), put this symbol on top of stack
            } else {
                symbolsStack.push(current);
            }
        }
        //after loop return if stack is empty
        return symbolsStack.isEmpty();
    }
}
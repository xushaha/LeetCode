class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelsAsSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelsAsSet.add(jewels.charAt(i));
        }
        int count = 0;

        for(Character stone : stones.toCharArray()) {
            if (jewelsAsSet.contains(stone)) {
                count++;
            }
        }

        return count;
    
    }
}
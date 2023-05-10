class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0 || strs == null) {
            return result;
        }

        HashMap<String, List<String>> map = new HashMap<>();


        for (String str : strs) {
            char[] alphabet = new char[26];

            for (int i = 0; i < str.length(); i++) {
                alphabet[str.charAt(i) - 'a']++;
            }
            String key = String.valueOf(alphabet);

            if (!map.containsKey(key)) { //если такой строки еще нет в мапе
                map.put(key, new ArrayList<>()); //добавляем ее в к-ве ключа, зн-е - новый лист
            }
            map.get(key).add(str); //вытаскиваем лист по ключу и добавляем туда саму строку

        }

        result.addAll(map.values()); // добавляем в лист все листы-значения из мапы

        return result;
        
        
    }
}
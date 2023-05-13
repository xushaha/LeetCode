class Solution {
    public int[] twoSum(int[] nums, int target) {

//создаем мапу в которой ключом будет эл-т массива, а значением индекс этого эл-та
    Map<Integer, Integer> map = new HashMap<>();

//проходим по входному массиву
        for (int i = 0; i < nums.length; i++) {

            int SecComp = target - nums[i];

            //на каждом шаге проверяем, есть ли в мапе число (ключ), равное разности
            //искомой суммы и элемента массива по текущему индексу
            if (map.containsKey(SecComp)) {
                //если есть, добавляем в новый массив текущий индекс и индекс элемента равного разности (из значения) 
                return new int[]{i, map.get(SecComp)};
            } 

            //если нет, добаляем в мапу эл-т массива и его индекс
            map.put(nums[i], i);
            
        }

        return null;
        
    }
}
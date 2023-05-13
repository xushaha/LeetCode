import java.util.Arrays;


class Solution {
    public boolean containsDuplicate(int[] nums) {
//создаем хэш-сет
        HashSet hS = new HashSet();
        //проходим по входному массиву
        for (int num : nums) {
            //на каждом шаге проверяем, есть ли уже в хэш-сете текущий элемент массива
            if (hS.contains(num)) {
                //если есть, возращаем тру
                return true;
            }
            //если нет, добавляем элемент в хэш-сет
            hS.add(num);
        }

    return false;
        
    }
}
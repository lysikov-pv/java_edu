// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

package basic.les_1;

import java.util.Random;

public class les_1d {

    public static int getRand(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int getHighBitNumber(int i){
        return Integer.toBinaryString(i).length();
    }

    public static int[] getMultiples(int rangeStart, int rangeEnd, int n, boolean isNonMul){
        int[] tmpArr = new int[Math.abs(rangeEnd - rangeStart)];
        int j = 0;
        for (int i = rangeStart; i < rangeEnd; i++) {
            if ((isNonMul && (i % n != 0)) || (!isNonMul && (i % n == 0))) {
                tmpArr[j++] = i;            
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < result.length; i++) result[i]=tmpArr[i];

        return result;
    }

    public static void main(String[] args){
        int i = getRand(2000);
        int n = getHighBitNumber(i);
        int[] m1 = getMultiples(i, Short.MAX_VALUE, n, false);
        int[] m2 = getMultiples(Short.MIN_VALUE, i, n, true);
    }
}
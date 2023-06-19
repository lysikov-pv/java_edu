// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package les_3;

import java.util.ArrayList;
import java.util.Random;

public class les_3 {

    public static ArrayList<Integer> getNewRandArrList(int len, int bound) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            result.add(new Random().nextInt(bound));
        }
        return result;
    }

    public static ArrayList<Integer> getOddArrList(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0)
                result.add(i);
        }
        return result;
    }

    public static int getMax(ArrayList<Integer> list) {
        int result = list.get(0);
        for (int i : list) {
            if (i > result)
                result = i;
        }
        return result;
    }

    public static int getMin(ArrayList<Integer> list) {
        int result = list.get(0);
        for (int i : list) {
            if (i < result)
                result = i;
        }
        return result;
    }

    public static int getMean(ArrayList<Integer> list) {
        int result = 0;
        for (int i : list) {
            result += i;
        }
        return result / list.size();
    }

    public static void main(String[] args) {

        System.out.println("Дан произвольный список целых чисел:");
        ArrayList<Integer> list = getNewRandArrList(10, 100);
        System.out.println(list);

        System.out.println("\n1) Удалить из него чётные числа:");
        list = getOddArrList(list);
        System.out.println(list);

        System.out.print("\n2) Минимальное значение: ");
        System.out.println(getMin(list));

        System.out.print("\n3) Максимальное значение: ");
        System.out.println(getMax(list));

        System.out.print("\n4) Среднее значение: ");
        System.out.println(getMean(list));
    }
}

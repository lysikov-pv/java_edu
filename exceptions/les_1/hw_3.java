package exceptions.les_1;

import java.util.Arrays;

public class hw_3 {
    public static int[] divArrays(int[] a, int[] b){
        int[] exeptionResult = {0};
        if (a.length != b.length) return exeptionResult;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) throw new RuntimeException("Деление на ноль");
            result[i] = a[i] / b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        String itresume_res = Arrays.toString(divArrays(a, b));
        System.out.println(itresume_res);
    }
}

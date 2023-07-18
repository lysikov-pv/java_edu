package codewars.fundamentals;
import java.util.Arrays;

public class T004 {
    /**
     * You get an array of numbers, return the sum of all of the positives ones.
     * <p>
     * Example [1,-4,7,12] => 1 + 7 + 12 = 20
     * <p>
     * Note: if there is nothing to sum, the sum is default to 0.
     */

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int mySum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }
        return result;
    }


    public static void testSomething() {
        assertEquals(15, sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, sum(new int[]{}));
        assertEquals(0, sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, sum(new int[]{-1, 2, 3, 4, -5}));
    }

    private static void assertEquals(String o1, String o2) {
        System.out.println(o1.equals(o2));
    }

    private static void assertEquals(int o1, int o2) {
        System.out.println(o1 == o2);
    }

    public static void main(String[] args) {
        testSomething();
    }
}

package exceptions.les_1;

public class ex_3 {
    public static int sum(int[][] arr) {
        if (arr.length != arr[0].length) throw new RuntimeException("Массив не квадратный: " + arr.length + "x" + arr[0].length);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result += arr[i][j];
                if (arr[i][j] != 0 && arr[i][j] != 1)
                    throw new RuntimeException("Массив заполнен не только 0 и 1: "
                            + arr[i][j] + " на [" + i + "][" + j + "]");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {2, 0}};
        try {
            System.out.println(sum(arr));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

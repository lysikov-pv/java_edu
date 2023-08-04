package exceptions.les_3.ex_3;

import java.util.Date;

public class Program {

    public static int getSum (String[][] arr) {
        Date date = new Date();
        int sum = 0;
        if (arr.length != 3 || arr[0].length != 3)
            throw new MyArraySizeException(date);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        try {
            System.out.println("Сумма равна: " + getSum(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }
}

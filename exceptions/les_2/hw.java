package exceptions.les_2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class hw {
    /**
     * Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
     * введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
     * повторно запросить у пользователя ввод данных.
     */
    public static float hw_1() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите вещественное число: ");
            String str = scanner.nextLine();
            try {
                return Float.parseFloat(str);
            } catch (Exception e) {
                System.out.println("Строка - не вещественное число. Попробуйте снова.");
            }
        }
    }

    /**
     * Задание 2. Если необходимо, исправьте данный код.
     */
    public static void hw_2() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 }; // Не был объявлен intArray
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {     // Если обобщить Exception, то можно так же отлавливать ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }
    }

    /**
     * Задание 3. Дан следующий код, исправьте его там, где требуется.
     */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void hw_3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {        // Переместить вниз т.к. это родительский класс и если его поместить вначале,
                                        // то остальные исключения не поймать
            System.out.println("Что-то пошло не так...");
        }
    }

    /**
     * Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void hw_4() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            if (!str.isEmpty()) {
                // break;
            } else {
                throw new RuntimeException("Пустую строку вводить нельзя");
            }
        }
    }

    public static void main(String[] args) {
        float f = hw_1();
        System.out.println("Введено число: " + f);

//        hw_2();
//
//        hw_3();
//
//        hw_4();
    }
}

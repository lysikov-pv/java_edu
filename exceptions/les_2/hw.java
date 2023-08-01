package exceptions.les_2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class hw {
    /**
     * ������� 1. ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ����������
     * ��������� ��������. ���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ����������
     * �������� ��������� � ������������ ���� ������.
     */
    public static float hw_1() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("������� ������������ �����: ");
            String str = scanner.nextLine();
            try {
                return Float.parseFloat(str);
            } catch (Exception e) {
                System.out.println("������ - �� ������������ �����. ���������� �����.");
            }
        }
    }

    /**
     * ������� 2. ���� ����������, ��������� ������ ���.
     */
    public static void hw_2() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 }; // �� ��� �������� intArray
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {     // ���� �������� Exception, �� ����� ��� �� ����������� ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }
    }

    /**
     * ������� 3. ��� ��������� ���, ��������� ��� ���, ��� ���������.
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
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (Throwable ex) {        // ����������� ���� �.�. ��� ������������ ����� � ���� ��� ��������� �������,
                                        // �� ��������� ���������� �� �������
            System.out.println("���-�� ����� �� ���...");
        }
    }

    /**
     * ������� 4. ������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������.
     * ������������ ������ ���������� ���������, ��� ������ ������ ������� ������.
     */
    public static void hw_4() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("������� ������: ");
            String str = scanner.nextLine();
            if (!str.isEmpty()) {
                // break;
            } else {
                throw new RuntimeException("������ ������ ������� ������");
            }
        }
    }

    public static void main(String[] args) {
        float f = hw_1();
        System.out.println("������� �����: " + f);

//        hw_2();
//
//        hw_3();
//
//        hw_4();
    }
}

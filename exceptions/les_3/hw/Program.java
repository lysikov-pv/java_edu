/**
 * �������� ����������, ������� ����� ����������� � ������������ ��������� ������ � ������������ �������,
 * ����������� ��������:
 * ������� ��� �������� ������������ ������������� ���
 *
 * ������� ������:
 * �������, ���, �������� - ������
 * ������������ - ������ ������� dd.mm.yyyy
 * ������������� - ����� ����������� ����� ��� ��������������
 * ��� - ������ ��������� f ��� m.
 *
 * ���������� ������ ��������� ��������� ������ �� ����������. ���� ���������� �� ��������� � ���������, �������
 * ��� ������, ���������� ��� � �������� ������������ ���������, ��� �� ���� ������ � ������ ������, ��� ���������.
 *
 * ���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������. ���� �������
 * ������ �� ���������, ����� ������� ����������, ��������������� ���� ��������. ����� ������������ ���������� ����
 * java � ������� ����. ���������� ������ ���� ��������� ����������, ������������ �������� ��������� � �����������,
 * ��� ������ �������.
 *
 * ���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������, � ���� � ���� ������
 * ������ ���������� ���������� ������, ����
 *
 * <�������><���><��������><������������><�������������><���>
 *
 * ������������ ������ ���������� � ���� � ��� �� ����, � ��������� ������.
 *
 * �� �������� ������� ���������� � ������.
 *
 * ��� ������������� �������� � �������-������� � ����, ���������� ������ ���� ��������� ����������, ������������
 * ������ ������� ��������� ������.
 *
 * �������� ������:
 * Ivanov Ivan Ivanych M 12.12.2012 81234567890
 * M 12.12.2012 +71234567890 Petrov Petr Ivanych
 */

package exceptions.les_3.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    private static final int FIELD_QTY = 6;

    public static Data getData() {
        String str = "";
        int error = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ����� ������ � ������������ �������. ��� ������ ������� \"q\":");
        str = scanner.nextLine();
        int wordsQty = str.split(" ").length;
        if (wordsQty < FIELD_QTY) error = 1;
        else if (wordsQty > FIELD_QTY) error = 2;
        if (str.equals("q")) error = -1;

        return new Data(str, error);
    }

    private static void saveToFile(String filePath, String text) {
        File file = new File(filePath);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write(text);
            System.out.println("������ ���������...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Data data;
        boolean end = false;
        do {
            data = getData();
            switch (data.getError) {
                case (-1) -> end = true;
                case (1)  -> System.out.println("���� ������. ���������� ��������� ����.");
                case (2)  -> System.out.println("����� ������. ���������� ��������� ����.");
            }
            if (data.getError == 0) {
                try {
                    ParsededData parsededData = new ParsededData(data.string);
                    saveToFile("exceptions/les_3/hw/" + parsededData.fullName[0],
                            String.format("<%s><%s><%s><%s><%s><%s>\n",
                                    parsededData.fullName[0],
                                    parsededData.fullName[1],
                                    parsededData.fullName[2],
                                    parsededData.birth,
                                    parsededData.phone,
                                    parsededData.gender));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!end);
        System.out.println("�����...");
    }
}

package exceptions.les_3.ex_3;

import java.util.Date;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super("�������� ��� ������ � ������ (" + i + ", " + j + ")");
    }
}

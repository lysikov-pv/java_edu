package exceptions.les_3.ex_3;

import java.util.Date;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(Date date) {
        super("������ ������� �� ������� 4�4 (" + date + ")");
    }
}

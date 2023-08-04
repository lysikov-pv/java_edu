package exceptions.les_3.ex_3;

import java.util.Date;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(Date date) {
        super("Массив отличен от размера 4х4 (" + date + ")");
    }
}

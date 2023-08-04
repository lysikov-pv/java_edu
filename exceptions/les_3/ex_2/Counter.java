package exceptions.les_3.ex_2;

import java.io.IOException;

public class Counter implements AutoCloseable{

    public Integer count;
    public Counter (int x) {
        count = x;
    }

    public Integer getCount() throws IOException {
        checkClose();
        return count;
    }

    public Counter(){
        count = 0;
    }
    public int add (int x) throws IOException {
        checkClose();
        return count += x;
    }
    private void checkClose() throws IOException {
        if (count == null) {
            throw new IOException("Переменная закрыта");
        }
    }

    @Override
    public void close() {
        count = null;
    }
}

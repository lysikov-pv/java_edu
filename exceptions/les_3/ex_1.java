package exceptions.les_3;

import java.io.IOException;

public class ex_1 {
    public static void doSomething() throws IOException {

    }
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

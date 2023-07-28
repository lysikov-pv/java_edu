package basic.les_4;

import java.util.LinkedList;
import java.util.Scanner;

public class les_4t {
    static Scanner iScanner = new Scanner(System.in);

    public static LinkedList revert(LinkedList list){
        LinkedList result = new LinkedList();
        for (Object element : list) {
            result.addFirst(element);
        }       
        return result;
    }

    /**
     * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void task_1(){
        System.out.println("=".repeat(20));
        System.out.println("Задача 1: ");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Исходный список: " + list);
        System.out.println("Перевернутый список: " + revert(list));
    }

    /**
     * 2*. Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void task_2(){
        System.out.println("=".repeat(20));
        System.out.println("Задача 2: ");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(20);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(9);

        System.out.println("Очередь: " + queue);
        System.out.printf("Возвращаем первый элемент очереди: %d\n", queue.first());
        System.out.printf("Возвращаем первый элемент очереди: %d\n", queue.first());
        System.out.printf("Выталкиваем первый элемент очереди: %d\n", queue.dequeue());
        System.out.printf("Выталкиваем первый элемент очереди: %d\n", queue.dequeue());
        System.out.printf("Выталкиваем первый элемент очереди: %d\n", queue.dequeue());
    }

    /**
     * 3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
     */
    public static void task_3() {
        while (true) {
            int i=0;
            String[] str = new String[3];
            boolean exit = false;
            while (i<3) {
                switch (i) {
                    case 0:
                        System.out.println("Введите первое число. (Для выхода введите q.)");
                        break;
                    case 1:
                        System.out.println("Введите операцию +, -, *, /. (Для выхода введите q, для отмены последнего ввода z.)");
                        break;
                    case 2:
                        System.out.println("Введите второе число. (Для выхода введите q, для отмены последнего ввода z.)");
                        break;
                }
                str[i] = iScanner.nextLine();
                if (exit = str[i].equals("q")) break;
                if (((i == 0 || i == 2) && str[i].matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) ||
                    (i == 1 && str[i].matches("[+-/*]"))) i++;
                else if (str[i].equals("z")) i--;
            }

            if (exit) break;
            float a = Float.parseFloat(str[0]);
            float b = Float.parseFloat(str[2]);
            String operation = str[1];

            float result = 0;
            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            System.out.print(((a - (int)a) < 0.000000001)?(int)a:a + "");
            System.out.print(" " + operation + " ");
            System.out.print(((b - (int)b) < 0.000000001)?((int)b):b + "");
            System.out.print(" = ");
            System.out.println(((result - (int)result) < 0.000000001)?(int)result:result + "");

        }
    }

    public static void main(String[] args) {

        task_1();
        task_2();
        task_3();
    }

}
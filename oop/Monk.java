package oop;

public class Monk extends Healer {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Monk(int qty) {
        super(++Monk.number, "Монах", qty, 30, 12, 7, 10, 12, 400, 12, 2);
    }
}

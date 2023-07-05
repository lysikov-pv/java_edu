package oop;

public class Sharpshooter extends Shooter {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Sharpshooter(int qty) {
        super(++Sharpshooter.number, "Снайпер", qty, 15, 12, 10, 8, 10, 400, 32);
    }
}

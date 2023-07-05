package oop;

public class Mage extends Healer {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Mage(int qty) {
        super(++Mage.number, "Маг", qty, 25, 11, 8, 7, 9, 350, 24, 4);
    }
}
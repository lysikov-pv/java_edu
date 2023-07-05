package oop;

public class Rogue extends Creature {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Rogue(int qty) {
        super(++Rogue.number, "Разбойник", qty, 4, 6, 1, 1, 2, 100);
    }
}
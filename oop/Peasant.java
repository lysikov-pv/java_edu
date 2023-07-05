package oop;

public class Peasant extends Creature {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Peasant(int qty) {
        super(++Peasant.number, "Крестьянин", qty, 1, 1, 1, 1, 1, 10);
    }
}
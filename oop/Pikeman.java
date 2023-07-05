package oop;

public class Pikeman extends Creature {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Pikeman(int qty) {
        super(++Pikeman.number, "Копейщик", qty, 10, 4, 5, 1, 3, 60);
    }
}
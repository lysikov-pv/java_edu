package oop;

public class Archer extends Shooter {
    protected static int number;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Archer(int qty) {
        super(++Archer.number, "Арбалетчик", qty, 10, 6, 3, 2, 3, 100, 12);
    }
}

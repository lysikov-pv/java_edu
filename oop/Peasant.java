package oop;

public class Peasant extends Creature {
    protected static int number;
    private static final int MAX_HP = 1;
    private static final int ATTACK = 1;
    private static final int DEFENSE = 1;
    private static final int MIN_DAMAGE = 1;
    private static final int MAX_DAMAGE = 1;
    private static final int COST = 10;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Peasant(int qty) {
        super(++Peasant.number, "Крестьянин", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST);
    }
}
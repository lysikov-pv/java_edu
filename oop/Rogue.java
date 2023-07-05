package oop;

public class Rogue extends Creature {
    protected static int number;
    private static final int MAX_HP = 4;
    private static final int ATTACK = 6;
    private static final int DEFENSE = 1;
    private static final int MIN_DAMAGE = 1;
    private static final int MAX_DAMAGE = 2;
    private static final int COST = 100;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Rogue(int qty) {
        super(++Rogue.number, "Разбойник", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST);
    }
}
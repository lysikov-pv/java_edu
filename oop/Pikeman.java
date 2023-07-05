package oop;

public class Pikeman extends Creature {
    protected static int number;
    private static final int MAX_HP = 10;
    private static final int ATTACK = 4;
    private static final int DEFENSE = 5;
    private static final int MIN_DAMAGE = 1;
    private static final int MAX_DAMAGE = 3;
    private static final int COST = 60;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Pikeman(int qty) {
        super(++Pikeman.number, "Копейщик", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST);
    }
}
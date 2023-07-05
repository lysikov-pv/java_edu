package oop;

public class Archer extends Shooter {
    protected static int number;
    private static final int MAX_HP = 10;
    private static final int ATTACK = 6;
    private static final int DEFENSE = 3;
    private static final int MIN_DAMAGE = 2;
    private static final int MAX_DAMAGE = 3;
    private static final int COST = 100;
    private static final int MAX_SHOOTS = 12;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Archer(int qty) {
        super(++Archer.number, "Арбалетчик", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST, MAX_SHOOTS);
    }
}

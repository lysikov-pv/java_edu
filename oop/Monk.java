package oop;

public class Monk extends Healer {
    protected static int number;
    private static final int MAX_HP = 30;
    private static final int ATTACK = 12;
    private static final int DEFENSE = 7;
    private static final int MIN_DAMAGE = 10;
    private static final int MAX_DAMAGE = 12;
    private static final int COST = 400;
    private static final int MAX_SHOOTS = 12;
    private static final int HEALING = 2;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Monk(int qty) {
        super(++Monk.number, "Монах", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST, MAX_SHOOTS, HEALING);
    }
}

package oop;

public class Sharpshooter extends Shooter {
    protected static int number;
    private static final int MAX_HP = 15;
    private static final int ATTACK = 12;
    private static final int DEFENSE = 10;
    private static final int MIN_DAMAGE = 8;
    private static final int MAX_DAMAGE = 10;
    private static final int COST = 400;
    private static final int MAX_SHOOTS = 32;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Sharpshooter(int qty) {
        super(++Sharpshooter.number, "Снайпер", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST, MAX_SHOOTS);
    }
}

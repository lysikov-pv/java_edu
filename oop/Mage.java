package oop;

public class Mage extends Healer {
    protected static int number;
    private static final int MAX_HP = 25;
    private static final int ATTACK = 11;
    private static final int DEFENSE = 8;
    private static final int MIN_DAMAGE = 7;
    private static final int MAX_DAMAGE = 9;
    private static final int COST = 350;
    private static final int MAX_SHOOTS = 24;
    private static final int HEALING = 4;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Mage(int qty) {
        super(++Mage.number, "Маг", qty, MAX_HP, ATTACK, DEFENSE, MIN_DAMAGE, MAX_DAMAGE, COST, MAX_SHOOTS, HEALING);
    }
}
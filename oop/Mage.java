package oop;

public class Mage extends Healer {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Mage(int qty) {
        super(qty,
                ++Mage.number,
                CreaturesSkills.Mage.NAME,
                CreaturesSkills.Mage.MAX_HP,
                CreaturesSkills.Mage.ATTACK,
                CreaturesSkills.Mage.DEFENCE,
                CreaturesSkills.Mage.MIN_DAMAGE,
                CreaturesSkills.Mage.MAX_DAMAGE,
                CreaturesSkills.Mage.COST,
                CreaturesSkills.Mage.MAX_SHOOTS,
                CreaturesSkills.Mage.HEALING);
    }
}
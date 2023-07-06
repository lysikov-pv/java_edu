package oop;

public class Peasant extends Creature {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Peasant(int qty) {
        super(qty,
                ++Peasant.number,
                CreaturesSkills.Peasant.NAME,
                CreaturesSkills.Peasant.MAX_HP,
                CreaturesSkills.Peasant.ATTACK,
                CreaturesSkills.Peasant.DEFENCE,
                CreaturesSkills.Peasant.MIN_DAMAGE,
                CreaturesSkills.Peasant.MAX_DAMAGE,
                CreaturesSkills.Peasant.COST);
    }
}
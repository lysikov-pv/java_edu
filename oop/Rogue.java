package oop;

public class Rogue extends Creature {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Rogue(int qty) {
        super(qty,
                ++Rogue.number,
                CreaturesSkills.Rogue.NAME,
                CreaturesSkills.Rogue.MAX_HP,
                CreaturesSkills.Rogue.ATTACK,
                CreaturesSkills.Rogue.DEFENCE,
                CreaturesSkills.Rogue.MIN_DAMAGE,
                CreaturesSkills.Rogue.MAX_DAMAGE,
                CreaturesSkills.Rogue.COST);
    }
}
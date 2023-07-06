package oop;

public class Pikeman extends Creature {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Pikeman(int qty) {
        super(qty, ++Pikeman.number,
                CreaturesSkills.Pikeman.NAME,
                CreaturesSkills.Pikeman.MAX_HP,
                CreaturesSkills.Pikeman.ATTACK,
                CreaturesSkills.Pikeman.DEFENCE,
                CreaturesSkills.Pikeman.MIN_DAMAGE,
                CreaturesSkills.Pikeman.MAX_DAMAGE,
                CreaturesSkills.Pikeman.COST);
    }
}
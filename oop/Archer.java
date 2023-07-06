package oop;

public class Archer extends Shooter {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Archer(int qty) {
        super(qty,
                ++Archer.number,
                CreaturesSkills.Archer.NAME,
                CreaturesSkills.Archer.MAX_HP,
                CreaturesSkills.Archer.ATTACK,
                CreaturesSkills.Archer.DEFENCE,
                CreaturesSkills.Archer.MIN_DAMAGE,
                CreaturesSkills.Archer.MAX_DAMAGE,
                CreaturesSkills.Archer.COST,
                CreaturesSkills.Archer.MAX_SHOOTS);
    }
}

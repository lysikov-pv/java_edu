package oop;

public class Monk extends Healer {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Monk(int qty) {
        super(qty,
                ++Monk.number,
                CreaturesSkills.Monk.NAME,
                CreaturesSkills.Monk.MAX_HP,
                CreaturesSkills.Monk.ATTACK,
                CreaturesSkills.Monk.DEFENCE,
                CreaturesSkills.Monk.MIN_DAMAGE,
                CreaturesSkills.Monk.MAX_DAMAGE,
                CreaturesSkills.Monk.COST,
                CreaturesSkills.Monk.MAX_SHOOTS,
                CreaturesSkills.Monk.HEALING);
    }
}

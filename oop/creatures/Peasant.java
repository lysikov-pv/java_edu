package oop.creatures;

public class Peasant extends Creature {
    protected static int number = 0;

    /**
     * Конструктор
     *
     * @param qty Количество
     * @param x   Координата X
     * @param y   Координата Y
     */
    public Peasant(int qty, int x, int y) {
        super(qty,
                x,
                y,
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
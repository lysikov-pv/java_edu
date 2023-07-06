package oop;

public class Sharpshooter extends Shooter {
    protected static int number = 0;
    /**
     * Конструктор
     * @param qty Количество
     */
    public Sharpshooter(int qty) {
        super(qty,
                ++Sharpshooter.number,
                CreaturesSkills.Sharpshooter.NAME,
                CreaturesSkills.Sharpshooter.MAX_HP,
                CreaturesSkills.Sharpshooter.ATTACK,
                CreaturesSkills.Sharpshooter.DEFENCE,
                CreaturesSkills.Sharpshooter.MIN_DAMAGE,
                CreaturesSkills.Sharpshooter.MAX_DAMAGE,
                CreaturesSkills.Sharpshooter.COST,
                CreaturesSkills.Sharpshooter.MAX_SHOOTS);
    }
}

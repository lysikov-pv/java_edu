package oop.creatures;

public abstract class Shooter extends Creature {
    private int maxShots; // Кол-во выстрелов

    /**
     * Конструктор
     *
     * @param qty       Количество
     * @param x         Координата Х
     * @param y         Координата Y
     * @param number    Порядковый номер
     * @param name      Название существа
     * @param maxHp     Здоровье
     * @param attack    Атака
     * @param defense   Защита
     * @param minDamage Минимальный урон
     * @param maxDamage Максимальный урон
     * @param cost      Стоимость
     * @param maxShots  Кол-во выстрелов
     */
    protected Shooter(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int maxShots) {
        super(qty, x, y, number, name, maxHp, attack, defense, minDamage, maxDamage, cost);
        this.maxShots = maxShots;
    }
}

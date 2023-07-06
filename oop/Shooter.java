package oop;

public abstract class Shooter extends Creature {
    private int maxShots; // Кол-во выстрелов
    /**
     * Конструктор
     *
     * @param qty       Количество
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
    protected Shooter(int qty, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int maxShots) {
        super(qty, number, name, maxHp, attack, defense, minDamage, maxDamage, cost);
        this.maxShots = maxShots;
    }
}

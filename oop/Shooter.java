package oop;

public abstract class Shooter extends Creature {
    private int maxShots; // Кол-во выстрелов

    /**
     * Конструктор
     * @param number Порядковый номер
     * @param name Название существа
     * @param qty Количество
     * @param maxHp Здоровье
     * @param attack Атака
     * @param defense Защита
     * @param minDamage Минимальный урон
     * @param maxDamage Максимальный урон
     * @param cost Стоимость
     * @param maxShots Кол-во выстрелов
     */
    public Shooter(int number, String name, int qty, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int maxShots) {
        super(number, name, qty, maxHp, attack, defense, minDamage, maxDamage, cost);
        this.maxShots = maxShots;
    }
}

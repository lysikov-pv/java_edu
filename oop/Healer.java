package oop;

public abstract class Healer extends Shooter {
    private int healing;  // Лечение

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
     * @param maxShoots // Кол-во выстрелов
     * @param healing // Лечение
     */
    public Healer(int number, String name, int qty, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int maxShoots, int healing) {
        super(number, name, qty, maxHp, attack, defense, minDamage, maxDamage, cost, maxShoots);
        this.healing = healing;
    }
}

package oop.creatures;

public abstract class Healer extends Shooter {
    private int healing;  // Лечение

    /**
     * Конструктор
     *
     * @param qty        Количество
     * @param x          Координата X
     * @param y          Координата Y
     * @param number     Порядковый номер
     * @param name       Название существа
     * @param maxHp      Здоровье
     * @param attack     Атака
     * @param defense    Защита
     * @param minDamage  Минимальный урон
     * @param maxDamage  Максимальный урон
     * @param cost       Стоимость
     * @param initiative Инициатива
     * @param maxShoots  Кол-во выстрелов
     * @param healing    Лечение
     */
    protected Healer(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative, int maxShoots, int healing) {
        super(qty, x, y, number, name, maxHp, attack, defense, minDamage, maxDamage, cost, initiative, maxShoots);
        this.healing = healing;
    }
}

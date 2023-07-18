package oop.creatures;

import java.util.ArrayList;

public abstract class Creature implements CreaturesActions{
    protected int number; // Порядковый номер
    protected String name; // Название существа
    protected int qty; // Количество
    protected int hp; // Текущее здоровье
    protected int maxHp; // Максимальное здоровье
    protected int attack;  // Атака
    protected int defense; // Защита
    protected int minDamage; // Минимальный урон
    protected int maxDamage; // Максимальный урон
    protected int cost; // Стоимость
    protected  int initiative; // Инициатива

    protected Position position; // Координаты

    /**
     * Конструктор существа
     *
     * @param qty        Количество
     * @param x          Координата X
     * @param y          Координата Y
     * @param number     Порядковый номер
     * @param name       Название существа
     * @param maxHp      Максимальное здоровье
     * @param attack     Атака
     * @param defense    Защита
     * @param minDamage  Минимальный урон
     * @param maxDamage  Максимальный урон
     * @param cost       Стоимость
     * @param initiative Инициатива
     */
    protected Creature(int qty, int x, int y, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost, int initiative) {
        this.name = name;
        this.number = number;
        this.qty = qty;
        position = new Position(x, y);
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.cost = cost;
        this.initiative = initiative;
    }

    public int getInitiative() {
        return initiative;
    }

    public String toString() {
        return String.format("Существо: %s #%d; Кол-во: %d; Координаты: (%d , %d)",
                name, number, qty, position.x, position.y);
    }

    public String getInfo() {
        return String.format("Существо: %s #%d; Кол-во: %d; Координаты: (%d , %d)",
                name, number, qty, position.x, position.y);
    }

    public void step(ArrayList<Creature> enemies, ArrayList<Creature> allies) {
        Creature nearestEnemy = findNearestEnemy(enemies);
        System.out.print(getInfo());
        System.out.printf(" -> Ближайшее существо: %s #%d; Растояние: %d \n",
                nearestEnemy.name,
                nearestEnemy.number,
                (int)Math.ceil(position.getDistance(nearestEnemy.position)));
    }

    public void getDemage(int demage) {
        int qtyDemage = demage / maxHp;
        if (qtyDemage < qty) {
            qty -= qtyDemage;
            hp -= demage - qtyDemage * maxHp;
        }
        else {
            die();
        }
    }

    public void die() {
        qty = 0;
        hp = 0;
    }

    protected Creature findNearestEnemy(ArrayList<Creature> enemies) {
        double minDistance = position.getDistance(enemies.get(0).position);
        int numberNearesEnemy = 0;
        for (int i = 0; i < enemies.size(); i++) {
            double distance = position.getDistance(enemies.get(i).position);
            if (distance < minDistance) {
                minDistance = distance;
                numberNearesEnemy = i;
            }
        }
        return enemies.get(numberNearesEnemy);
    }
}
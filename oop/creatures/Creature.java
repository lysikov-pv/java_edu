package oop.creatures;

import java.util.ArrayList;

public abstract class Creature implements CreaturesInterface {
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
    protected int initiative; // Инициатива

    protected Position position; // Координаты
    public CreaturesActions action; // Действие


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
        action = CreaturesActions.waiting;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getHp() {
        return hp;
    }

    public Position getPosition() {
        return position;
    }

    public String toString() {
        return String.format("%s #%d [Кол-во: %d]",
                name, number, qty);
    }

    public String toChar() {
        return name.substring(0,2) + number;
    }

    public String getInfo() {
        return String.format("%s #%d [Кол-во: %d]",
                name, number, qty);
    }

    public void step(ArrayList<Creature> enemies, ArrayList<Creature> allies) {
        Creature nearestEnemy = findNearest(enemies);
        System.out.print(getInfo());
        System.out.printf(" -> Ближайшее существо: %s #%d; Растояние: %d \n",
                nearestEnemy.name,
                nearestEnemy.number,
                (int)Math.ceil(position.getDistance(nearestEnemy.position)));
    }

    public void doDamage(int damage) {
        int qtyDamage = damage / maxHp;
        if (qtyDamage < qty) {
            qty -= qtyDamage;
            hp -= damage - qtyDamage * maxHp;
        }
        else {
            die();
        }
    }

    public int doHeal(int healing) {
        int damage = maxHp - hp;
        int healingPoints = (damage > healing) ? healing : damage;
        hp += healingPoints;
        return healingPoints;
    }

    public void die() {
        qty = 0;
        hp = 0;
        action = CreaturesActions.died;
    }

    protected Creature findNearest(ArrayList<Creature> creatures) {
        double minDistance = -1;
        int numberNearest = -1;
        for (int i = 0; i < creatures.size(); i++) {
            if(!creatures.get(i).action.equals(CreaturesActions.died)) {
                double distance = position.getDistance(creatures.get(i).position);
                if (minDistance == -1 || distance < minDistance) {
                    minDistance = distance;
                    numberNearest = i;
                }
            }
        }
        if (numberNearest != -1) {
            return creatures.get(numberNearest);
        }
        else {
            return null;
        }
    }
}
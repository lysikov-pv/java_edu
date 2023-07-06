package oop;

public abstract class Creature implements CreaturesActions{
    protected int number; // Порядковый номер
    protected String name; // Название существа
    private int qty; // Количество
    private int hp; // Здоровье 
    private int maxHp; // Максимальное здоровье
    private int attack;  // Атака
    private int defense; // Защита
    private int minDamage; // Минимальный урон
    private int maxDamage; // Максимальный урон
    private int cost; // Стоимость

    /**
     * Конструктор существа
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
     */
    protected Creature(int qty, int number, String name, int maxHp, int attack, int defense, int minDamage, int maxDamage, int cost) {
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.cost = cost;
    }

    public String toString() {
        return String.format("Существо: %s #%d, Кол-во: %d",
                this.name, this.number, this.qty);
    }

    public String getInfo() {
        return String.format("Существо: %s #%d, Кол-во: %d",
                this.name, this.number, this.qty);
    }

    public void step() {

    }
}
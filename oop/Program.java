package oop;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static void create_army1() {
        ArrayList<Creature> army1 = new ArrayList<>();
        army1.add(new Mage(random.nextInt(1, 21)));
        army1.add(new Sharpshooter(random.nextInt(1, 51)));
        army1.add(new Rogue(random.nextInt(1, 201)));
        army1.add(new Rogue(random.nextInt(1, 201)));
        System.out.println("Армия 1:");
        for (Creature creature : army1) {
            System.out.println(creature.getInfo());
        }

        ArrayList<Creature> army2 = new ArrayList<>();
        army2.add(new Monk(random.nextInt(1, 21)));
        army2.add(new Archer(random.nextInt(1, 51)));
        army2.add(new Pikeman(random.nextInt(1, 51)));
        army2.add(new Peasant(random.nextInt(1, 101)));
        System.out.println("\nАрмия 2:");
        for (Creature creature : army2) {
            System.out.println(creature.getInfo());
        }
    }
    public static void create_army2(){
        ArrayList<Creature> army1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(4)){
                case 0:
                    army1.add(new Mage(random.nextInt(1, 21)));
                    break;
                case 1:
                    army1.add(new Sharpshooter(random.nextInt(1, 51)));
                    break;
                case 2:
                    army1.add(new Rogue(random.nextInt(1, 201)));
                    break;
                default:
                    army1.add(new Peasant(random.nextInt(1, 101)));
            }
        }
        System.out.println("Армия 1:");
        for (Creature creature : army1) {
            System.out.println(creature.getInfo());
        }
        ArrayList<Creature> army2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(4)){
                case 0:
                    army2.add(new Monk(random.nextInt(1, 21)));
                    break;
                case 1:
                    army2.add(new Archer(random.nextInt(1, 51)));
                    break;
                case 2:
                    army2.add(new Pikeman(random.nextInt(1, 51)));
                    break;
                default:
                    army2.add(new Peasant(random.nextInt(1, 101)));
            }
        }
        System.out.println("\nАрмия 2:");
        for (Creature creature : army2) {
            System.out.println(creature.getInfo());
        }

    }
    public static void main(String[] args) {
        create_army2();
    }
}
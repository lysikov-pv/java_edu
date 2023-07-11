package oop;

import oop.creatures.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static ArrayList<Creature> army1 = new ArrayList<>();
    public static ArrayList<Creature> army2 = new ArrayList<>();
    public static void create_army_manually() {

        army1.add(new Mage(random.nextInt(1, 21), 1, 1));
        army1.add(new Sharpshooter(random.nextInt(1, 51),1,2));
        army1.add(new Rogue(random.nextInt(1, 201),1,3));
        army1.add(new Rogue(random.nextInt(1, 201),1,4));
        System.out.println("Армия 1:");
        for (Creature creature : army1) {
            System.out.println(creature.getInfo());
        }

        army2.add(new Monk(random.nextInt(1, 21), 15, 1));
        army2.add(new Archer(random.nextInt(1, 51), 15, 2));
        army2.add(new Pikeman(random.nextInt(1, 51),15,3));
        army2.add(new Peasant(random.nextInt(1, 101),15,4));
        System.out.println("\nАрмия 2:");
        for (Creature creature : army2) {
            System.out.println(creature.getInfo());
        }
    }
    public static void create_army_randomly(){
        HashSet<Integer> occupiedPositions = new HashSet<>(10);
        int newPosition;
        for (int i = 0; i < 10; i++) {
            while (true) {
                newPosition = random.nextInt(1, 12);
                if (!occupiedPositions.contains(newPosition)){
                    occupiedPositions.add(newPosition);
                    break;
                }
            }
            switch (random.nextInt(4)){
                case 0:
                    army1.add(new Mage(random.nextInt(1, 21), 1, newPosition));
                    break;
                case 1:
                    army1.add(new Sharpshooter(random.nextInt(1, 51),1, newPosition));
                    break;
                case 2:
                    army1.add(new Rogue(random.nextInt(1, 201),1, newPosition));
                    break;
                default:
                    army1.add(new Peasant(random.nextInt(1, 101),1, newPosition));
            }
        }
        System.out.println("Армия 1:");
        for (Creature creature : army1) {
            System.out.println(creature.getInfo());
        }

        occupiedPositions.clear();
        for (int i = 0; i < 10; i++) {
            while (true) {
                newPosition = random.nextInt(1, 12);
                if (!occupiedPositions.contains(newPosition)){
                    occupiedPositions.add(newPosition);
                    break;
                }
            }
            switch (random.nextInt(4)){
                case 0:
                    army2.add(new Monk(random.nextInt(1, 21), 15, newPosition));
                    break;
                case 1:
                    army2.add(new Archer(random.nextInt(1, 51), 15, newPosition));
                    break;
                case 2:
                    army2.add(new Pikeman(random.nextInt(1, 51),15, newPosition));
                    break;
                default:
                    army2.add(new Peasant(random.nextInt(1, 101),15, newPosition));
            }
        }
        System.out.println("\nАрмия 2:");
        for (Creature creature : army2) {
            System.out.println(creature.getInfo());
        }

    }
    public static void do_step() {
        System.out.println("\nАрмия 1:");
        army1.forEach(creature -> creature.step(army2));
        System.out.println("\nАрмия 2:");
        army2.forEach(creature -> creature.step(army1));
    }
    public static void main(String[] args) {
        create_army_randomly();
        do_step();
    }
}
package oop;

import oop.creatures.*;
import oop.view.View;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static ArrayList<Creature> army1 = new ArrayList<>();
    public static ArrayList<Creature> army2 = new ArrayList<>();
    public static ArrayList<Creature> allCreatures = new ArrayList<>();

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
        for (int i = 1; i < 11; i++) {

            switch (random.nextInt(4)){
                case 0:
                    army1.add(new Mage(random.nextInt(1, 21), 1, i));
                    break;
                case 1:
                    army1.add(new Sharpshooter(random.nextInt(1, 51),1, i));
                    break;
                case 2:
                    army1.add(new Rogue(random.nextInt(1, 201),1, i));
                    break;
                default:
                    army1.add(new Peasant(random.nextInt(1, 101),1, i));
            }
        }
//        System.out.println("Армия 1:");
//        for (Creature creature : army1) {
//            System.out.println(creature.getInfo());
//        }

        occupiedPositions.clear();
        for (int i = 1; i < 11; i++) {

            switch (random.nextInt(4)){
                case 0:
                    army2.add(new Monk(random.nextInt(1, 21), 10, i));
                    break;
                case 1:
                    army2.add(new Archer(random.nextInt(1, 51), 10, i));
                    break;
                case 2:
                    army2.add(new Pikeman(random.nextInt(1, 51),10, i));
                    break;
                default:
                    army2.add(new Peasant(random.nextInt(1, 101),10, i));
            }
        }
//        System.out.println("\nАрмия 2:");
//        for (Creature creature : army2) {
//            System.out.println(creature.getInfo());
//        }

        allCreatures.addAll(army1);
        allCreatures.addAll(army2);

    }
    public static void do_step() {

//        System.out.println("\nАрмия 1:");
//        army1.forEach(creature -> creature.step(army2, army1));
//        System.out.println("\nАрмия 2:");
//        army2.forEach(creature -> creature.step(army1, army2));

        allCreatures.sort(((o1, o2) -> o2.getInitiative() - o1.getInitiative()));
        int i = 0;
        for (Creature creature: allCreatures) {
            // System.out.printf("Ход %d\n", ++i);
            if (army1.contains(creature)) {
                creature.step(army2, army1);
            }
            else {
                creature.step(army1, army2);
            }
        }
    }
    public static void main(String[] args) {
        create_army_randomly();
        for (int i = 0; i < 10; i++) {
            View.view();
            do_step();
        }
    }
}
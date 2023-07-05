package oop;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    public static Random random = new Random();
    public static void main(String[] args) {

        ArrayList<Creature> army1 = new ArrayList<>();
        army1.add(new Mage(random.nextInt(1, 21)));
        army1.add(new Sharpshooter(random.nextInt(1, 51)));
        army1.add(new Rogue(random.nextInt(1, 201)));
        army1.add(new Rogue(random.nextInt(1, 201)));
        System.out.println("Армия 1:");
        for (Creature creature : army1) {
            System.out.println(creature);
        }

        ArrayList<Creature> army2 = new ArrayList<>();
        army2.add(new Monk(random.nextInt(1, 21)));
        army2.add(new Archer(random.nextInt(1, 51)));
        army2.add(new Pikeman(random.nextInt(1, 51)));
        army2.add(new Peasant(random.nextInt(1, 101)));
        System.out.println("\nАрмия 2:");
        for (Creature creature : army2) {
            System.out.println(creature);
        }
    }
}

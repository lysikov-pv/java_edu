package oop;

import oop.creatures.*;
import oop.view.View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static Random random = new Random();
    public static ArrayList<Creature> army1 = new ArrayList<>();
    public static ArrayList<Creature> army2 = new ArrayList<>();
    public static ArrayList<Creature> allCreatures = new ArrayList<>();

    public static void create_armys(){
        for (int i = 1; i < 11; i++) {
            switch (random.nextInt(4)){
                case 0:
                    army1.add(new Mage(10, 1, i));
                    break;
                case 1:
                    army1.add(new Sharpshooter(5,1, i));
                    break;
                case 2:
                    army1.add(new Rogue(100,1, i));
                    break;
                default:
                    army1.add(new Peasant(50,1, i));
            }
        }
        for (int i = 1; i < 11; i++) {
            switch (random.nextInt(4)){
                case 0:
                    army2.add(new Monk(10, 10, i));
                    break;
                case 1:
                    army2.add(new Archer(10, 10, i));
                    break;
                case 2:
                    army2.add(new Pikeman(100,10, i));
                    break;
                default:
                    army2.add(new Peasant(50,10, i));
            }
        }
        allCreatures.addAll(army1);
        allCreatures.addAll(army2);
    }
    public static void do_step() {
        allCreatures.sort(((o1, o2) -> o2.getInitiative() - o1.getInitiative()));
        int i = 0;
        for (Creature creature: allCreatures) {
            if (army1.contains(creature)) {
                creature.step(army2, army1);
            }
            else {
                creature.step(army1, army2);
            }
        }
    }
    public static int whoWin(){
        boolean win1 = true;
        for (Creature creature: army2) {
            if(!creature.action.equals(CreaturesActions.died)) { win1 = false; }
        }
        boolean win2 = true;
        for (Creature creature: army1) {
            if(!creature.action.equals(CreaturesActions.died)) { win2 = false; }
        }
        if (win1) return 1;
        if (win2) return 2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        create_armys();
        View.view();

        while (whoWin() == 0) {
            scanner.nextLine();
            do_step();
            View.view();
        }

        View.log.add(String.format("Конец игры. Победила армия %s!",
                (whoWin() == 1) ? "зеленых" : "синих"));
        View.view();
    }
}
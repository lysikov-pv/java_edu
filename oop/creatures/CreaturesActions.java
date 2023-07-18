package oop.creatures;

import java.util.ArrayList;

public interface CreaturesActions {
    String getInfo();

    void step(ArrayList<Creature> enemies, ArrayList<Creature> allies);
}

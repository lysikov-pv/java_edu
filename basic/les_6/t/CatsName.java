package basic.les_6.t;

import java.util.Random;

public enum CatsName {
    Барсик, Персик, Уголек, Снежок, Мурзик;

    public static String get(){
        return String.valueOf(CatsName.values()[new Random().nextInt(CatsName.values().length)]);
    }
}



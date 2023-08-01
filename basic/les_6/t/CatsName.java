package basic.les_6.t;

import java.util.Random;

public enum CatsName {
    Barsik, Persik, Ugolek, Snezhok, Murzik;

    public static String get(){
        return String.valueOf(CatsName.values()[new Random().nextInt(CatsName.values().length)]);
    }
}



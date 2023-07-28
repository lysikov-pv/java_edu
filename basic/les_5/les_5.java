package basic.les_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class les_5 {

    public static void task_1() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Random().nextInt(10));   
        }
        System.out.println("Исходный map: " + map);
        System.out.print("Значения кратные 3: ");
        for (int key : map.keySet()) {
            if (map.get(key) % 3 == 0) System.out.printf("%d=%d, ", key, map.get(key));
        }        
    }

    public static void task_2() {
        Map<Integer, String> map_male = new HashMap<>();
        Map<Integer, String> map_female = new HashMap<>();
        enum Male_Name {
            Alex,
            Boris,
            Victor,
            Dmitrii,
            Egor,
            Evgenii,
            Zahar
        }
        enum Female_Name {
            Anastasiya,
            Victoriya,
            Dasha,
            Elizaveta,
            Zhanna,
            Kristina,
            Liza
        }
        for (int i = 0; i < 7; i++) {
            int rnd = new Random().nextInt(7);
            map_male.put(rnd, Male_Name.values()[rnd].toString());
            rnd = new Random().nextInt(7);
            map_female.put(rnd, Female_Name.values()[rnd].toString());
        }
        System.out.println("Исходный map: " + map_male);
        System.out.println("Исходный map: " + map_female);
        System.out.print("Пересечения ключей: ");
        for (int key : map_male.keySet()) {
            if (map_female.containsKey(key)) System.out.printf("%d=%s=%s, ", key, map_male.get(key), map_female.get(key));
        }        
    }

    public static void task_3() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Random().nextInt(10));   
        }
        System.out.println("Исходный map: " + map);
        for (int key : map.keySet()) {
            int value = map.get(key);
            map.replace(key, value*value);
        }
        System.out.println("Выходной map: " + map);
    }

    public static void task_4() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Random().nextInt(10));   
        }
        System.out.println("Исходный map: " + map);
        map.forEach((key, value) -> map.replace(key, value*value));

        System.out.println("Выходной map: " + map);
    }

        public static void task_5() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Random().nextInt(10));   
        }
        System.out.println("Исходный map: " + map);
        map.replaceAll((key, value) -> value*value);

        System.out.println("Выходной map: " + map);
    }


    public static void main(String[] args) {

        task_5();

    }
}

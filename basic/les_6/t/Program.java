package basic.les_6.t;

import java.util.HashSet;

public class Program {
    static final boolean MALE = true;
    static final boolean FEMALE = false;

    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<Cat>();
        /**
         * Добавление с конструктором (возраст, пол) с автоматической генерацией имени
         */
        cats.add(new Cat(1, MALE));
        cats.add(new Cat(3, FEMALE));

        /**
         * Добавление двух объектов с одинаковыми параметрами
         */
        Cat cat1 = new Cat("Барсик", "Полина", "нет", 2, MALE);
        Cat cat2 = new Cat("Барсик", "Полина", "нет", 2, MALE);
        /**
         * Переопределенный метод equals говорит что это тот же самый.
         */
        System.out.println("Один и тот же кот: " + cat1.equals(cat2));
        /**
         * Добавляем одинаковых котов и видим что если hashCode закоментирован то оба кота добавляются,
         * если раскоментирован то добавляется только один т.к. у обоих объектов одинаковый хэш
         * и для множества это один и тот же объект
         */
        cats.add(cat1);
        cats.add(cat2);
        System.out.println(cats);
    }

}




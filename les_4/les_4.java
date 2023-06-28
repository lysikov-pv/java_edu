// 1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// 2. добавить возможность выхода или вывода списка отсортированного по возрасту!)
// 3. *реализовать сортировку по возрасту с использованием индексов
// 4. *реализовать сортировку по возрасту и полу с использованием индексов
package les_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class les_4 {
    static Scanner iScanner = new Scanner(System.in);
    static ArrayList <String> lastname = new ArrayList<>();
    static ArrayList <String> name = new ArrayList<>();
    static ArrayList <String> surname = new ArrayList<>();
    static ArrayList <Integer> age = new ArrayList<>();
    static ArrayList <Boolean> gender = new ArrayList<>();
    static ArrayList <Integer> ids = new ArrayList<>();
    static byte LASTNAME = 0;
    static byte NAME = 1;
    static byte SURNAME = 2;
    static byte AGE = 3;
    static byte GENDER = 4;

    public static void printAll() {
        for (int i = 0; i < lastname.size(); i++) {
            System.out.printf("%d. %s %s.%s. %s %s\n",
                i,
                lastname.get(i),
                name.get(i).charAt(0),
                surname.get(i).charAt(0),
                age.get(i),
                gender.get(i) ? "M" : "F"
            );
        }
    }

    public static void printByIds(int[] ids) {
        int num = 0;
        for (int i: ids) {
            System.out.printf("%d. %s %s.%s. %s %s\n",
                num++,
                lastname.get(i),
                name.get(i).charAt(0),
                surname.get(i).charAt(0),
                age.get(i),
                gender.get(i) ? "M" : "F"
            );
        }
    }

    public static void readDb() {
        System.out.println("Введите записи в формате \"Фамилия Имя Отчество возраст пол\":");

        while (true) {
            String str = iScanner.nextLine();
            if (str.equals("q")) break;

            String[] record = str.split(" ");
            lastname.add(record[LASTNAME]);
            name.add(record[NAME]);
            surname.add(record[SURNAME]);
            age.add(Integer.parseInt(record[AGE]));
            gender.add(record[GENDER].toLowerCase().contains("m"));
        }        
    }

    public static int[] getIndxSortByAge() {
        ArrayList<Integer[]> sortedAge = new ArrayList<>(age.size());
        int n = 0;
        for (Integer i : age) {
            sortedAge.add(new Integer[] { n++, i });
        }

        sortedAge.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });

        int[] result = new int[age.size()];
        int j = 0;
        for (Integer[] i : sortedAge) {
            result[j++] = i[0];
        }
        return result;
    }

    public static int[] sortByAge() {
        int[] ids = new int[age.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
        return sortByAge(ids);
    }

    public static int[] sortByAge(int[] ids) {
        ArrayList<Integer[]> sortedList = new ArrayList<>(age.size());

        for (int i : ids) {
            sortedList.add(new Integer[] { i, age.get(i) });
        }

        sortedList.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });

        int[] result = new int[age.size()];
        int j = 0;
        for (Integer[] i : sortedList) {
            result[j++] = i[0];
        }
        return result;
    }

    public static int[] sortByGender() {
        int[] ids = new int[gender.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
        return sortByGender(ids);
    }

    public static int[] sortByGender(int[] ids) {
        ArrayList<Integer[]> sortedList = new ArrayList<>(gender.size());

        for (int i : ids) {
            sortedList.add(new Integer[] { i, gender.get(i)?1:0 });
        }

        sortedList.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        });

        int[] result = new int[gender.size()];
        int j = 0;
        for (Integer[] i : sortedList) {
            result[j++] = i[0];
        }
        return result;
    }

    // public static ArrayList<Integer> sortByGender2(ArrayList<Integer> ids) {
    //     Collections.sort(ids, new Comparator<Integer>() {
    //         @Override
    //         public int compare(Integer o1, Integer o2) {
    //             return gender.get(o1) - gender.get(o2);
    //         }           
    //     });
    //     return ids;
    // }


    public static int[] getIds() {
        int[] result = new int[age.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        readDb();
        //printAll();
        printByIds(sortByGender(sortByAge()));
    }
}


// Petrov Petr Petrovich 26 m
// Ivanov Ivan Ivanych 16 m
// Sidorova Svetlana Sergeevna 17 f
// Mironova Ekaterina Anatolevna 27 f
// Savushkin Arkadij Egorovich 33 m
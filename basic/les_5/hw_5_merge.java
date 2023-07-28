// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
// телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть
// отсортирован по убыванию числа телефонов.

package basic.les_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hw_5_merge {
    public static Map<String, String> phonebook = new HashMap<>();

    public static void add_record(String name, String phone) {
        phonebook.merge(name, phone, (o, n) -> o == null ? n : o + "; " + n);
    }
    
    public static ArrayList<String> sortByPhones() {
        ArrayList<String> sortedNames = new ArrayList<>(phonebook.keySet());
        sortedNames.sort((o1, o2) -> phonebook.get(o2).split("; ").length - phonebook.get(o1).split("; ").length);
        return sortedNames;
    }

    public static void print_records(ArrayList<String> keys) {
        for (String key : keys) {
            System.out.println(key + " " + phonebook.get(key));
        }
    }
    public static void main(String[] args) {
        add_record("Ivanov", "+7123");
        add_record("Petrov", "+7567");
        add_record("Ivanov", "+7321");
        print_records(sortByPhones());
    }
}

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
// телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть
// отсортирован по убыванию числа телефонов.

package les_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;

public class hw_5 {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void add_record(String name, String phone) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phone);
        }
        else {
            phonebook.put(name, new ArrayList<String>(Arrays.asList(phone.split("\n"))));
        }
    }
    
    public static void sortByPhones(Map<String, ArrayList<String>> map) {
        // Collections.sort(map, (o1, o2) -> o1.getValue().size().compareTo(o2.getValue().size()));
    }

    public static void print_records(Map<String, ArrayList<String>> map) {
        map.forEach((key, value) -> System.out.println(key + " " + value));

    }
    public static void main(String[] args) {
        add_record("Ivanov", "+7123");
        add_record("Petrov", "+7567");
        add_record("Ivanov", "+7321");
        print_records(phonebook);
    }
}

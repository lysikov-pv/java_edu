// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными
// телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть
// отсортирован по убыванию числа телефонов.

package les_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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
    
    // public static Map<String, ArrayList<String>> sortByPhones(Map<String, ArrayList<String>> map) {
    //     List<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(map.entrySet());
    //     entries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());
         
 
    //     Map<String, ArrayList<String>> result = new LinkedHashMap<>();
    //     for (Map.Entry<String, ArrayList<String>> entry : entries) {
    //         result.put(entry.getKey(), entry.getValue());
    //     }
    //     return result;
    // }

    public static List<Map.Entry<String, ArrayList<String>>> sortByPhones2(Map<String, ArrayList<String>> map) {
        List<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());
        return entries;
    }

    public static void print_records(Map<String, ArrayList<String>> map) {
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void print_records(List<Map.Entry<String, ArrayList<String>>> entries) {
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        add_record("Ivanov", "+7123");
        add_record("Petrov", "+7567");
        add_record("Ivanov", "+7321");
        print_records(sortByPhones2(phonebook));
    }
}

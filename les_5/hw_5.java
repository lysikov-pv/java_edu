package les_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hw_5 {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void add_record(String name, String phone) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phone);
        }
        else {
            //ArrayList<String> new_phones = new ArrayList<>();
            //new_phones.add(phone);
            //phonebook.put(name, new_phones);
            phonebook.put(name, new ArrayList<String>(Arrays.asList(phone.split("\n"))));
        }
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
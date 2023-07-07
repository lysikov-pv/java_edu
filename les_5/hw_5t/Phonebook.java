package les_5.hw_5t;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    /**
     * Добавляет запис в справочник. Если имя уже существует то расширяет его же список телефонов.
     *
     * @param name  имя
     * @param phone телефон
     * @return String "Создана" если имени в справочнике не было и "Расширена" если имя уже было
     */
    public String add(String name, String phone) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phone);
            return "Расширена";
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phonebook.put(name, phones);
            return "Создана";
        }
    }

    /**
     * Возвращает список телефонов по имени
     *
     * @param name имя
     * @return телефоны в формате ArrayList<String>
     */
    public ArrayList<String> get(String name) {
        return phonebook.get(name);
    }

    /**
     * Возвращает запись по имени как строку
     *
     * @param name имя
     * @return String в формате "Имя: ...; Номера: ..., ...."
     */
    public String out(String name) {
        StringBuilder result = new StringBuilder();
        result.append("Имя: ")
                .append(name)
                .append("; Номера: ");
        phonebook.get(name).forEach(phone -> result.append(phone).append(", "));
        result.setLength(result.length() - 2);
        return result.toString();
    }
}

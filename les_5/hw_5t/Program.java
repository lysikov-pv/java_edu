package les_5.hw_5t;

public class Program {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        System.out.println("1. Запрос несуществующей");
        System.out.println(phonebook.get("Ivanov"));

        System.out.println("\n2. Добавление записей");
        System.out.println(phonebook.add("Ivanov", "+7123"));
        System.out.println(phonebook.add("Petrov", "+7567"));
        System.out.println(phonebook.add("Ivanov", "+7321"));

        System.out.println("\n3. Запрос существующей с несколькими телефонами");
        System.out.println(phonebook.get("Ivanov"));

        System.out.println("\n4. Печать записи");
        System.out.println(phonebook.out("Ivanov"));
    }
}

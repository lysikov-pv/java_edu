package les_6.t;

import java.util.Objects;

/**
 * Класс для описания котов
 */
class Cat {
    private String name; // Имя
    private String ownersName; // Имя владельца
    private String breed; // Порода
    private int age; // Возраст
    private boolean isMale; // Пол

    public String toString() {
        return String.format("\nИмя: %s, Возраст: %d, Пол: %s, Порода: %s, Владелец: %s",
                name, age, isMale?"М":"Ж", breed, ownersName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat other = (Cat) o;
        return age == other.age
                && isMale == other.isMale
                && Objects.equals(name, other.name)
                && Objects.equals(ownersName, other.ownersName)
                && Objects.equals(breed, other.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ownersName, breed, age, isMale);
    }

    public Cat(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        this.ownersName = "нет";
        this.breed = "нет";
    }

    public Cat(int age, boolean isMale) {

        this.name = CatsName.get();
        this.isMale = isMale;
        this.age = age;
        this.ownersName = "нет";
        this.breed = "нет";
    }

    public Cat(String name, String ownersName, String breed, int age, boolean isMale) {
        this.name = name;
        this.ownersName = ownersName;
        this.breed = breed;
        this.age = age;
        this.isMale = isMale;
    }

}

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
 * разделенные пробелом:
 * Фамилия Имя Отчество датарождения номертелефона пол
 *
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * датарождения - строка формата dd.mm.yyyy
 * номертелефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 *
 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть
 * код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
 *
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы
 * данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы
 * java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией,
 * что именно неверно.
 *
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку
 * должны записаться полученные данные, вида
 *
 * <Фамилия><Имя><Отчество><датарождения><номертелефона><пол>
 *
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 *
 * Не забудьте закрыть соединение с файлом.
 *
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь
 * должен увидеть стектрейс ошибки.
 *
 * Тестовые данные:
 * Ivanov Ivan Ivanych M 12.12.2012 81234567890
 * M 12.12.2012 +71234567890 Petrov Petr Ivanych
 */

package exceptions.les_3.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    private static final int FIELD_QTY = 6;

    public static Data getData() {
        String str = "";
        int error = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел в произвольном порядке. Для выхода введите \"q\":");
        str = scanner.nextLine();
        int wordsQty = str.split(" ").length;
        if (wordsQty < FIELD_QTY) error = 1;
        else if (wordsQty > FIELD_QTY) error = 2;
        if (str.equals("q")) error = -1;

        return new Data(str, error);
    }

    private static void saveToFile(String filePath, String text) {
        File file = new File(filePath);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write(text);
            System.out.println("Данные сохранены...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Data data;
        boolean end = false;
        do {
            data = getData();
            switch (data.getError) {
                case (-1) -> end = true;
                case (1)  -> System.out.println("Мало данных. Попробуйте повторить ввод.");
                case (2)  -> System.out.println("Много данных. Попробуйте повторить ввод.");
            }
            if (data.getError == 0) {
                try {
                    ParsededData parsededData = new ParsededData(data.string);
                    saveToFile("exceptions/les_3/hw/" + parsededData.fullName[0],
                            String.format("<%s><%s><%s><%s><%s><%s>\n",
                                    parsededData.fullName[0],
                                    parsededData.fullName[1],
                                    parsededData.fullName[2],
                                    parsededData.birth,
                                    parsededData.phone,
                                    parsededData.gender));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!end);
        System.out.println("Выход...");
    }
}

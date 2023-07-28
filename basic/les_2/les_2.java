// Задание
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
// этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в
// виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Дополнительные задания
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
// строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000
// символов средствами String и StringBuilder.

package basic.les_2;

import java.util.Random;

public class les_2 {

    public static String genReqFromPairsArr(String[] params) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < params.length; index++) {
            if (!params[index].contains(":null")) {
                builder
                    .append(params[index].replace(":", " = '"))
                    .append("' AND ");
            }
        }
        builder.delete(builder.length()-5, builder.length()); // Удаляем последний " AND "
        return builder.toString();
    }

    public static String genStrFromPairsArr(String[] params) {
        return "Студент " + params[0].split(":")[1] +
               " получил " + params[1].split(":")[1] +
               " по предмету " + params[2].split(":")[1] +
               ".";
    }

    public static String[] parseStrToPairsArr(String str) {
        return str
            .replace("\"", "")
            .replace(" ", "")
            .replace("{", "")
            .replace("}", "")
            .split(",");
    }
    
    public static String[] parseJsonToStrArr(String str) {
        return str
            .replace("},{", "};{")
            .split(";");
    }

    public static String genStr(int len) {
        StringBuilder sBuilder = new StringBuilder();
        Random random = new Random();
        int NUM_OF_CHARS = 26;
        int CODE_OF_FIRST_CHAR = 97;
        for (int i = 0; i < len; i++) {
            sBuilder.appendCodePoint(random.nextInt(NUM_OF_CHARS) + CODE_OF_FIRST_CHAR);
        }
        return sBuilder.toString();
    }

    public static void main(String[] args) {
        // Задание ================================================================================
        String str1 = new String("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        System.out.println(
            "select * from students where " + 
            genReqFromPairsArr(parseStrToPairsArr(str1))
        );

        // Дополнительное задание =================================================================
        String str2 = new String("{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}");
        String[] strArr = parseJsonToStrArr(str2);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(genStrFromPairsArr(parseStrToPairsArr(strArr[i])));
        }

        // Задание со звездочкой ==================================================================
        int len = 150000;
        long startTime = System.currentTimeMillis();
        String str3 = genStr(len);
        System.out.println("Время генерации строки длиной " + len + ": " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        str3.replace("a", "A");
        System.out.println("Время замены символа методом String: " + (System.currentTimeMillis() - startTime));

        StringBuilder sBuilder = new StringBuilder(str3);
        startTime = System.currentTimeMillis();
        for (int index = 0; index < sBuilder.length(); index++) {
            if (sBuilder.charAt(index) == 'a') sBuilder.setCharAt(index, 'A');
        }
        System.out.println("Время замены символа в StringBuilder: " + (System.currentTimeMillis() - startTime));
    }
}
package exceptions.les_2;

import java.io.*;
import java.util.ArrayList;

public class ex_1 {
public static boolean isNumeric(String s) {
    try {
        Integer.getInteger(s);
        return true;
    } catch (Exception e) {
        return false;
    }
}
public static ArrayList<String[]> read(){

    BufferedReader reader;
    FileReader f = null;

    ArrayList<String[]> strings = new ArrayList<>();

    try {
        f = new FileReader("exceptions/les_2/in.txt");
        try {
            reader = new BufferedReader(f);
            String line = reader.readLine();

            while (line != null) {
                strings.add(line.split(" = "));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Не удается считать из файла");;
        }
    } catch (FileNotFoundException e) {
        System.out.println("Файл не открывается");;
    }
    return strings;
}

    public static void write(ArrayList<String[]> strings){

        BufferedWriter writer;
        FileWriter f = null;

        try {
            f = new FileWriter("exceptions/les_2/out.txt");
            try {
                writer = new BufferedWriter(f);
                for (String[] string : strings) {
                    writer.write(string[0] + " = " + string[1] + "\n");
                }

                writer.close();
            } catch (IOException e) {
                System.out.println("Не удается записать в файл");;
            }
        } catch (IOException e) {
            System.out.println("Файл не открывается");;
        }
    }

    public static void main(String[] args) {

        ArrayList<String[]> strings = read();

        for (String[] string : strings) {
            if(string[1].equals("?")) {
                string[1] = String.valueOf(string[0].length());
            } else if (!isNumeric(string[1])) {
                throw new RuntimeException("Не ? и не число");
            }
        }
        write(strings);
    }
}

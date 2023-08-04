package exceptions.les_3.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParsededData {
    public String[] fullName;
    public String birth;
    public String phone;
    public String gender;
    public int parseError;

    protected String returnSubstring(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public ParsededData (String str) throws RuntimeException {
        birth = returnSubstring(str, "\\d{2}[.]\\d{2}[.]\\d{4}");
        phone = returnSubstring(str, "(8|\\+7)\\d{10}");
        gender = returnSubstring(str, "\\b(?i:м|ж|m|f)\\b");

        if (birth != null) str = str.replaceFirst("\\d{2}.\\d{2}.\\d{4}", "");
        else throw new RuntimeException("Дата рождения в установленном формате отсутствует");

        if (phone != null) str = str.replaceFirst("(8|\\+7)\\d{10}", "");
        else throw new RuntimeException("Телефон в установленном формате отсутствует");

        if (gender != null) str = str.replaceFirst("\\b(?i:m|f)\\b", "");
        else throw new RuntimeException("Пол в установленном формате отсутствует");

        fullName = str.trim().split(" ");
        if (fullName.length > 3) {
            throw new RuntimeException("Для имени в строке слишком много слов");
        } else if (fullName.length < 3) {
            throw new RuntimeException("Для имени в строке слишком мало слов");
        }
    }
}
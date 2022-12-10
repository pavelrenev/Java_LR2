import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String pattern = "((((0[1-9])|(3[0-1])|([1-2][0-9]))[/]((0[1,3,5,7,8])|10|12))|(((0[1-9])|30|([1-2][0-9]))[/]((0[4,6,9])|11))|(((0[1-9])|(1[0-9])|(2[0-9]))[/](02)))[/]((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))";
        System.out.print("Введите дату формата dd/mm/yyyy: ");
        String text = num.next();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.print("Введенное значение: " + text + " - является датой ");
        } else {
            System.out.print("Введенное значение: " + text + " - не является датой ");
        }

    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Two {
    public Two() {
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Pattern p = Pattern.compile("[a-zA-Z_0-9]+");
        Pattern pat1 = Pattern.compile("[a-z]");
        Pattern pat2 = Pattern.compile("[A-Z]");
        Pattern pat3 = Pattern.compile("[0-9]");
        int k = 0;

        while(k==0) {
            System.out.println("Введите пароль, длинной не менее 8 символов, который содержит хотябы одну цыфру, заглавную и строчную букву Английского алфавита: ");
            String password = num.next();
            Matcher m = p.matcher(password);
            Matcher m1 = pat1.matcher(password);
            Matcher m2 = pat2.matcher(password);
            Matcher m3 = pat3.matcher(password);
            if (password.length() >= 8) {
                if (m.matches() & m1.find() & m2.find() & m3.find()) {
                    System.out.println("Пароль: " + password + " - надежный");
                    k = 1;
                } else {
                    System.out.println("Пароль: " + password + " - ненадежный, попробуйте ещё раз");
                }
            } else {
                System.out.println("Пароль: " + password + " - ненадежный, попробуйте ещё раз");
            }
        }

    }
}


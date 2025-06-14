package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai02 {
    public static void main(String[] args) {
        System.out.println("Chapter 7 - Bai02");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Matcher matcher = pattern.matcher("teddy@gmail.com");

        System.out.println("Input String matches regex - "+ matcher.matches());
    }
}


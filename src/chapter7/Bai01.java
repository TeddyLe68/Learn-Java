package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai01 {
    public static void main(String[] args) {
        System.out.println("Chapter 7 - Bai01");
        Pattern pattern = Pattern.compile("0\\d{11}");
        Matcher matcher = pattern.matcher("023456789012");

        System.out.println("Input String matches regex - "+ matcher.matches());
    }
}

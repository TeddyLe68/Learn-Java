package tatthang;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hello, my name is" + name + "!"+ " and I am "+ age +" years old.");
        scanner.close();
    }
}

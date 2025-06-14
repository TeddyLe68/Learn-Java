package chapter6;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        System.out.print("Nhập vào username: ");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.print("Nhập password: ");
        String password = scan.nextLine();
        scan.close();


        if(username.equals("teddy") && password.length() > 6){
            System.out.println("Account validated !");
            System.out.println("Your account have username: " + username + " and password: " + password);
        }else {
            System.out.println("Wrong invalidated");
        }
    }
}

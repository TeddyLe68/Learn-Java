package Lab02;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
//        - Nếu số điện <= 100 => số tiền = số điện x 1000
//        - Nếu số điện > 100
//        => số tiền = 100 * 1000 + (số điện - 100) * 1500

        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tien dien");
        System.out.print("Nhap so dien: ");
        int a = scan.nextInt();

        if (a <= 100) {
            int tien = a * 1000;
            System.out.println("Tien dien la: " + tien);
        } else {
            int money = 100 * 1000;
            int tien = money + (a - 100) * 1500;
            System.out.println("Tien dien la: " + tien);
        }
    }
}

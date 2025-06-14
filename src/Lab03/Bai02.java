package Lab03;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Viết bảng cửu chương của 1 số nguyên bất kỳ");

        System.out.print("Nhap so nguyen bat ki: ");
        int number = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n",number,i,number*i);
        }

    }
}

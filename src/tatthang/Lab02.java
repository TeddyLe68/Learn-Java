package tatthang;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println("Lab 02");
        // chu vi hinh chu nhat
        // dien tich hinh chu nhat
        // canh nho nhat cua hinh chu nhat

        Scanner scanner =  new Scanner(System.in);


        System.out.println("Nhap chieu dai: ");
        int a = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        int b = scanner.nextInt();

        int chuvi = (a+b)*2;
        int dientich = a*b;
        int canhnhonhat = Math.min(a,b);

        System.out.println("Chu vi hinh chu nhat: "+ chuvi);
        System.out.println("Dien tich hinh chu nhat: "+ dientich);
        System.out.println("Canh nho nhat cua hinh chu nhat: "+ canhnhonhat);
    }
}

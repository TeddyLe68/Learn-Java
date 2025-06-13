package Lab02;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
//        - Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//        - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//        - Còn lại: x = -b/a => thông báo x = ?
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();

        System.out.print("Nhap b: ");
        int b = scan.nextInt();


        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) -b / a;
            System.out.printf("Phuong trinh co nghiem = %.3f ", x);
        }

        scan.close();

    }
}

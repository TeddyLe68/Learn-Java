package Lab02;

import java.util.Scanner;

public class Bai02 {

    public static void giaiPhuongTrinhBacNhat(int b, int c) {
        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", b, c);
        if (b == 0 && c == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (b == 0 && c != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) -c / b;
            System.out.printf("Phuong trinh co nghiem = %.3f ", x);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bai 02");
//        - Nếu a = 0 => làm tương tự ví dụ bài 1
//                - Nếu a # 0:
//        - Tính delta = b^2 - 4ac.
//                - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//                - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//                - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//                x1 = (-b + căn(delta))/(2*a)
//        x2 = (-b - căn(delta))/(2*a)


        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        System.out.print("Nhap b: ");
        int b = scan.nextInt();
        System.out.print("Nhap c: ");
        int c = scan.nextInt();

        System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);

        if (a == 0) {
            giaiPhuongTrinhBacNhat(b, c);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.printf("Phuong trinh co nghiem kep x = %.3f ", (-b + Math.sqrt(delta)) / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem rieng biet x1 = %.3f, x2 = %.3f", x1, x2);

            }
        }


        scan.close();
    }
}

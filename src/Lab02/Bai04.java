package Lab02;

import java.util.Scanner;

public class Bai04 {
    public static void Bai01() {

//        - Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//        - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//        - Còn lại: x = -b/a => thông báo x = ?
        System.out.println("Lua chon 1");
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

    public static void Bai02() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bai 04");
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất               |");
        System.out.println("| 2. Giải phương trình bậc hai                |");
        System.out.println("| 3. Tính số tiền điện                        |");
        System.out.println("| 4. Kết thúc                                 |");
        System.out.println("++ ----------------------------------------- ++");

        System.out.print("Your choice:");
        int choosen = scan.nextInt();

        switch (choosen) {
            case 1:
                // giai phuong trinh bac nhat
                Bai01();
                break;
            case 2:
                // giai phuong trinh bac hai
                break;
            case 3:
                // tinh so tien dien
                break;
            default:
                System.exit(0);


        }
        scan.close();
    }
}

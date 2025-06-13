package tatthang;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        System.out.println("Lab 01");
        int maxScore = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.println("Điểm trung bình: ");
        int avg = scanner.nextInt();

        System.out.println(name + " có điểm "+ avg + "/"+maxScore);
    }
}

package chapter11;

import java.util.Scanner;

public class Chapter11 {
    public static String nhapMssv() {
        System.out.print("Nhap mssv: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String nhapTen() {
        System.out.print("Nhap Ten: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double nhapDiem() {
        boolean isValidDiem = false;
        double diem = 0.0;
        Scanner input = new Scanner(System.in);
        while (!isValidDiem) {
            try {
                System.out.print("Nhap diem sinh vien: ");
                diem = input.nextDouble();
                if (diem > 0 && diem < 10) {
                    isValidDiem = true;
                    return diem;
                } else {
                    throw new IllegalAccessException("Điểm không hợp lệ. Nhập lại.");
                }

            } catch (NumberFormatException | IllegalAccessException e) {
                System.out.println("ERROR " + e.getMessage());
            }
        }
        return diem;

    }

    public static int nhapTuoi() {
        Scanner input = new Scanner(System.in);
        int tuoi = 0;
        boolean isValidTuoi = false;
        while (!isValidTuoi) {

            try {
                System.out.print("Nhap tuoi sinh vien: ");
                tuoi = input.nextInt();
                if (tuoi > 18 && tuoi < 100) {
                    isValidTuoi = true;
                    return tuoi;
                } else {
                    throw new IllegalAccessException("Tuổi không hợp lệ. Nhập lại.");
                }
            } catch (NumberFormatException | IllegalAccessException e) {
                System.out.println("ERROR " + e.getMessage());

            }
        }
        return tuoi;
    }

    public static void main(String[] args) {
        System.out.println("Chapter 11");
        String mssv = nhapMssv();
        String ten = nhapTen();
        double diem = nhapDiem();
        int age = nhapTuoi();
        SinhVien sinhvien = new SinhVien(mssv, ten, diem, age);
        System.out.println(sinhvien);
    }
}

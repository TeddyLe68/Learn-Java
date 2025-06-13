package tatthang;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("Lab 03");
        // tinh the tich hinh lap phuong

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhap vao canh cua hinh lap phuong: ");
        int canh = scanner.nextInt();

        double theTich =  Math.pow(canh,3);
        System.out.println("The tich hinh lap phuong la: "+ theTich);

        scanner.close();

    }
}

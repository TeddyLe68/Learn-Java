package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
//        - Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
//        - Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số nguyên tố
//        - Sử dụng toán tử % để biết có chia hết hay không ?

        System.out.println("Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số\n" +
                "nguyên tố hay không ?");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int number = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.printf("%d không là số nguyên tố!",number);
        }else {
            System.out.printf("%d là số nguyên tố!",number);
        }

    }
}


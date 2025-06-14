package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        // Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
        //nhập và tính tổng của nó
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();


        while (true) {
            System.out.print("Enter number:");
            double input = scan.nextDouble();
            list.add(input); // tại đây sẽ có cơ chế autoboxing/unboxing convert double(stack) -> Double(heap) "rõ hơn là chyển từ
                             // kiểu primitive sang non-primitive để bộ reference từ stack qua heap "
            scan.nextLine(); // note: nếu không có dòng này thì khi nhấn Enter nó sẽ nhảy vào dòng nextLine phía dưới
                            //  vì Enter cũng được chương trinh hiểu như một kí tự
            System.out.print("Add more ? Y or N: ");
            String option = scan.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }
        }

        double sum = 0.0;
        for (Double aDouble : list) {
            sum += aDouble;
        }

        System.out.println("List: " + list.toString());
        System.out.println("Sum: " + sum);
        scan.close();
    }
}

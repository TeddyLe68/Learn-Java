package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
//        Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//        Sắp xếp và xuất mảng vừa nhập ra màn hình
//        Xuất phần tử có giá trị nhỏ nhất
//        Xuất phần tử có giá trị lớn nhất
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of size of number: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
         System.out.println("Array before: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array after: "+ Arrays.toString(a));

        System.out.print("The max number in the array is: "+ Math.max(a[0], a[size-1]));
        System.out.print('\n');
        System.out.print("The min number in the array is: "+ Math.min(a[0], a[size-1]));


    }
}

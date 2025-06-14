package chapter5;

import chapter4.Product;

import java.util.ArrayList;

public class Knowledge {
    public static void main(String[] args) {
        // ArrayList là gì?
        System.out.println("Start learning chapter5");

        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Product> listProduct = new ArrayList<Product>(); // generic trong java
        // nếu như không có <String> hay bat kì object nào thì ArrayList sẽ tự động tạo ra kiểu cho dữ liệu truyền vào
        // bằng cơ chế autoboxing/unboxing
        a.add("Object 1");
        a.add("Object 2");
        a.add("Object 3");

        System.out.println(a.toString());
    }
}

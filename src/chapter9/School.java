package chapter9;

public class School {
    public static void main(String[] args) {
        System.out.println("Chapter 9 - Polymorphism");

        SinhVien sv1 = new SinhVienIT(9.5,8);
        SinhVien sv2 = new SinhVienCoKhi(8,9.2);


        System.out.println("Sinh Vien IT: "+  sv1.getDiem());
        System.out.println("Sinh Vien Co Khi: "+  sv2.getDiem());



    }
}

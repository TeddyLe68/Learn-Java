package chapter8;

public class Chap8 {
    public static void main(String[] args) {
        System.out.println("Chapter 8");
        SinhVienIT sv1 =  new SinhVienIT("java","123","Teddy",1000,0.1);
        System.out.println("Check: "+sv1.toString());

        SinhVienCoKhi sv2 = new SinhVienCoKhi("Autocad","111","Nam",1400,0.4);
        System.out.println("Check: "+sv2.toString());
    }
}

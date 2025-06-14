package chapter4;

public class ProductDetail {
    public static void main(String[] args) {
        Product product = new Product();

        Product product1 = product.nhapThongTin("Bánh mì", 15000, 10);

        System.out.println("Hóa đơn:");
        product.xuatThongTin(product1);
        System.out.println("Total: " + product.getTaxPrice(product1.getPrice(), product1.getTax()));
    }
}

package SuperReview;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(10000, "1234","Teddy");
        PartTimeEmployee pte = new PartTimeEmployee("888","thắng",25000,12);
        System.out.println("Danh sach: ");
        fte.showInfo();
        System.out.println();
        pte.showInfo();


    }
}

package SuperReview;

public class FullTimeEmployee extends Employeee {
    private double salary;

    public FullTimeEmployee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    void tinhLuong() {

    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Salary: " + salary);
    }

}

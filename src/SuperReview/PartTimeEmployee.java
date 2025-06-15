package SuperReview;

public class PartTimeEmployee extends Employeee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void tinhLuong() {

    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

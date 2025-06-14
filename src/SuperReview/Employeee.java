package SuperReview;

public abstract class Employeee {
    protected String id;
    protected String name;

    abstract void tinhLuong();

    public Employeee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

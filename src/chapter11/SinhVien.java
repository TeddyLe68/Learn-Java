package chapter11;

public class SinhVien {
    private String mssv;
    private String hoTen;
    private double diem;
    private int age;

    public SinhVien(String mssv, String hoTen, double diem, int age) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diem = diem;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien {" +
                "mssv='" + mssv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package chapter8;

public class SinhVienIT extends SinhVien {
    private String language;

    // constructor with parameters
    public SinhVienIT( String language,String id, String name, double price, double tax){
        super(id,name,price,tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney() {
        System.out.println("run get money");
        super.info();
    }
}

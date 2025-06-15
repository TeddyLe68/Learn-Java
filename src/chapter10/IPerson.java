package chapter10;

public interface IPerson {
    //bản chât bên trong thằng interface thì các phương thức đó đều là môt abstract class,vì thế
    // phải overide lại khi các class khác implemnts
    public void input();
    public void display();
}

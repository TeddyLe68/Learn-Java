package chapter10;

public class Lab {
    public static void main(String[] args) {
        System.out.println("Bai tap");
        Student st1= new Student("123","teddy",23, 3);
        System.out.println(st1);
        st1.setGrade();
        System.out.println(st1);

        Person p1 = new Person("123","thang",21);
        System.out.println(p1);
    }
}

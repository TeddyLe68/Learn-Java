package chapter4;

public class oop {
    public static void main(String[] args) {
        System.out.println("Run test java oop!");

        Student st1 = new Student("Teddy", 22);

        System.out.println("Student name is " + st1.getName()+ " and age is " + st1.getAge());

        st1.setName("Teddyyyyy");
        st1.setAge(23);
        System.out.println("Student name is " + st1.getName()+ " and age is " + st1.getAge());

    }
}

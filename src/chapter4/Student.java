package chapter4;

public class Student {

    // access modifier : public -> protected -> default -> private
    private String name;
    private int age;


    // ở đây gọi là "hàm tạo" nghĩa là khi ta sử dụng new Student thì java
    // sẽ có thể tự tạo như bên dưới hoặc ta có thể tạo thủ công
    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ở đây thể hiện tính đóng gói trong OOP, nghĩa là ta chỉ biết sử
    // chứ không biết thật sự bên trong nó có gì
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void learnJava() {
        System.out.println("Learn Java with Youtuber");
    }
}

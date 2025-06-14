package chapter6;

import java.util.ArrayList;

public class Bai02 {
    public static void main(String[] args) {
        Student student1 = new Student("John","123456");
        Student student2 = new Student("Mary","123456");
        Student student3 = new Student("Jack","123456");
        Student student4 = new Student("Thắng tất","123456");
        Student student5 = new Student("Thắng lê","123456");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        System.out.println(students.toString());
        System.out.println("Danh các học sinh có tên \"Thắng\":");
        for(int i = 0; i < students.size();i++){
            if(students.get(i).getName().startsWith("Thắng")){
                System.out.print(students.get(i));
            }
        }


    }
}

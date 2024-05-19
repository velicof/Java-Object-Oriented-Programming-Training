package lab1.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Matematica", "incepatori");
        Student s1 = new Student(), s2 = new Student(), s3 = new Student();
        s1.setName("Marius");
        s1.setYear(4);
        s1.setGender(GenderType.MALE);
        s2.setName("Adi");
        s2.setYear(3);
        s2.setGender(GenderType.MALE);
        s3.setName("Dan");
        s3.setYear(3);
        s3.setGender(GenderType.MALE);
        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);

        List<Student> filteredStudents = course.filterYear(3);
        System.out.println(filteredStudents);
    }
}

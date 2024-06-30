package lab4;

import lab4.database.Database;
import lab4.database.Helpers;
import lab4.people.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Helpers.addStudents();
        Helpers.addTeachers();
        List<Student> studentList = Database.getDatabase().findAllStudents();
        for (Student student : studentList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.averageGrade());
        }
        System.out.println(Database.getDatabase().getStudentsByAverageGrade());

    }

}

package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton
    public final static Database db = new Database();
    public static Integer nrInstances = 0;
    private Database(){

    }
    public static Database getDatabase(){
        ++nrInstances;
        return db;
    }


    public static int getNumberOfInstances() {
        // TODO
        return nrInstances;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> newTeacher = new ArrayList<>();
        for (Teacher tc : teachers){
            if (tc.getSubjects().contains(subject)) {
                newTeacher.add(tc);
            }
        }
        return newTeacher;
    }

    public List<Student> findAllStudents() {

        return students;
    }

    public List<Teacher> findAllTeachers() {

        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> newStudents = new ArrayList<>();
        for(Student si : students) {
            if (si.getSubjects().containsKey(subject)) {
                newStudents.add(si);
            }
        }
        return newStudents;
    }

    public List<Student> getStudentsByAverageGrade() {
        students.sort(Comparator.comparingDouble(Student::averageGrade));
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        students.sort(Comparator.comparingDouble(o -> o.getGradeForSubject(subject)));
        return students;
    }
}

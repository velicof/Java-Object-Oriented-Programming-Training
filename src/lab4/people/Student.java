package lab4.people;

import lab4.database.Database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects = new HashMap<>();

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Student(Student student) {
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        subjects.putAll(student.subjects);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double sum = 0.0;

//        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
//            entry.getKey();
//            entry.getValue();
//        }

        for (Integer grade : subjects.values()) {
            sum += grade;
        }
        return sum / subjects.size();
    }

    public List<Teacher> getAllTeachers() {

        return Database.getDatabase().findAllTeachers();
    }

    public int getGradeForSubject(String subject) {
        return (subjects.get(subject));
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {

        return Database.getDatabase().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        // TODO
        return Database.getDatabase().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {

        return Database.getDatabase().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Database.getDatabase().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Database.getDatabase().getStudentsBySubject(subject);
    }
}


package home_work.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    String title;
    String description;
    Student[] students = new Student[3];


    public Course() {
            this.title = " INIT TITLE ";
            this.description = " INIT DESCRIPTION ";
            for (int i=0; i<students.length; i++) {
               this.students[i] = new Student();
       }
    }

    public Student[] filterYear(Integer ani){
        Student[] st = new Student[3];

        for (int i = 0; i < students.length; i++) {
             st[i] = new Student();
        };

        for (int i = 0; i < students.length; i++){
            if (students[i].getYear().equals(ani)) {
                st[i].name = students[i].name;
            }
        }
        return st;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

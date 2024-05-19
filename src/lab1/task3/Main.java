package lab1.task3;

import lab1.task2.GenderType;
import lab1.task2.Student;


public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(), s2 = new Student();
        s1.setName("Alex");
        s1.setYear(1);
        s1.setGender(GenderType.MALE);
        s2.setName("Alex");
        s2.setYear(1);
        s2.setGender(GenderType.MALE);

        System.out.println(s1.equals(s2));
//        Integer a = 2, b = 2;
//        System.out.println(a.equals(b));
        // s1 == s2 -> compara referinta (memoria)
        // s1.equals(s2) -> Daca sunt tipuri de date de baza gen Integer, String, Double
        // compara valoarea
        // s1.equals(s2) -> Daca sunt obiecte compuse compara doar duoa memorie
        // Daca vrem ca equals sa compare valorile, putem sa il generam sau sa il facem
        // pe propriul nostru plac
    }
}

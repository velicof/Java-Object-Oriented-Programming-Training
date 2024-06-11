package home_work.task2;

public class main {
    public static void main(String[] args){
        Course cr = new Course();
        Student[] allStudents = new Student[3];


        allStudents[0] = new Student();
        allStudents[0].name ="Alex";
        allStudents[0].year = 2;
        allStudents[1] = new Student();
        allStudents[1].name ="Dan";
        allStudents[1].year = 2;
        allStudents[2] = new Student();
        allStudents[2].name ="Denisa";
        allStudents[2].year = 10;
        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i].name + " " + allStudents[i].year + " \n");
        }

        cr.students[0] = allStudents[0];
        cr.students[1] = allStudents[1];
        cr.students[2] = allStudents[2];

        for (int i = 0; i < cr.students.length; i++) {
            System.out.println(cr.students[i].name + " \n");
        }


        Student[] studentmain = new Student[3];
        studentmain[0] = new Student();
        studentmain[1] = new Student();
        studentmain[2] = new Student();
        studentmain = cr.filterYear(2);
         for (int i = 0; i < studentmain.length; i++){
             System.out.println(studentmain[i].name);
         }
    }
}

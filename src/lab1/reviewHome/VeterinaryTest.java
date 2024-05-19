package lab1.reviewHome;

public class VeterinaryTest {
    public static void main(String []args){
        VeterinaryReport report = new VeterinaryReport();
        report.cats = 3;
        report.dogs = 5;

        report.displayStatistics();
    }
}

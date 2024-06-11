package home_work.task1;

public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.dogs = 99;
        vr.cats = 199;

        vr.displayStatistics();
        System.out.println("Aceasta clasa spune ca sunt" + vr.getAnimalCount() + "animale");
    }

}

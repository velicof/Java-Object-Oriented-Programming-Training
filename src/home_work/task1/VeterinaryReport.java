package home_work.task1;

public class VeterinaryReport {
    int dogs;
    int cats;

    public int getAnimalCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Numarul total de animale este:" + getAnimalCount());
    }
}

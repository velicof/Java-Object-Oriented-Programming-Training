package lab3.learn;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Caine caine = new Caine();
        Pisica pisica = new Pisica();
        List<Animal> animals = new ArrayList<>();
        animals.add(caine);
        animals.add(pisica);
        for (Animal animal : animals) {
            if (animal instanceof Caine) {
                Caine caine1 = (Caine) animal;
            }
        }
    }
}

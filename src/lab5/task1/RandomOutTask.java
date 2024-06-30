package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task {

    @Override
    public void execute() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        System.out.println(randomNumber);
    }

}

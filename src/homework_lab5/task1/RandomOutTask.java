package homework_lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task {

    Random random;
    int randomNumber;
    public RandomOutTask(){
        random = new Random();
        randomNumber = random.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(randomNumber);
    }
    //    @Override
//    public void execute() {
//        Random random = new Random();
//        int randomNumber = random.nextInt();
//        System.out.println(randomNumber);
//    }
}

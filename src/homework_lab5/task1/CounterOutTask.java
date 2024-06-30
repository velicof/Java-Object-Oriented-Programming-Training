package homework_lab5.task1;

public class CounterOutTask implements Task{

    public static Integer number;

    @Override
    public void execute() {
        number++;
        System.out.println(number);

    }
}

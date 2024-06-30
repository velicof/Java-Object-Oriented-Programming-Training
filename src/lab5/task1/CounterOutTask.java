package lab5.task1;

public class CounterOutTask implements Task {
    public static Integer counter = 0;

    @Override
    public void execute() {
        counter++;
        System.out.println(counter);
    }
}

package lab4.learn;

public class DatabaseWork {

    private static DatabaseWork instance = null;

    Integer value;
    Integer value2;

    private DatabaseWork() {

    }

    public static DatabaseWork getInstance() {
        if (instance == null) {
            instance = new DatabaseWork();
        }
        return instance;
    }

    public void addValue(Integer value) {
        this.value += value;
    }



}

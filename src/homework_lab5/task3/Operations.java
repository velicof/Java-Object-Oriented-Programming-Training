package homework_lab5.task3;

public class Operations implements Minus,Div,Plus,Mult {

    private float number1;

    @Override
    public void div(float number) {
        number1/=number;
    }

    @Override
    public void minus(float number) {
        number1-=number;
    }

    @Override
    public void mult(float number) {
        number1*=number;
    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    @Override
    public void plus(float number) {
        number1+=number;
    }
}

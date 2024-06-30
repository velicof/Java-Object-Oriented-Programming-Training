package lab5.task3;

public class Operation implements Div, Minus, Plus, Mult{

    private float number;

    public Operation(float number) {
        this.number = number;
    }

    @Override
    public void div(float number) {
        this.number /= number;
    }

    @Override
    public void minus(float number) {
        this.number -= number;
    }

    @Override
    public void mult(float number) {
        this.number *= number;
    }

    @Override
    public void plus(float number) {
        this.number += number;
    }

    public float getNumber() {
        return number;
    }
}

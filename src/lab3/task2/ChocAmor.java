package lab3.task2;

import lab3.task1.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    public  ChocAmor() {

    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "The" + origin + " " + flavor + " has volume " + getVolume();
    }
    public void printChocAmorDim(){
        System.out.println("length is "+ length);
    }
}

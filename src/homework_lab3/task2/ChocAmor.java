package homework_lab3.task2;

import homework_lab3.task1.CandyBox;

public class ChocAmor extends CandyBox {
    private float length;
    public ChocAmor (){
        super();
        length = 1;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }
    public float getVolume(){
        return (float) (length * length * length);
    }
    public String toString(){
        return ("The " + origin + " " + flavor + " has volume" + getVolume());
    }
    public String printChocAmorDim(){
        return ("lungimea este " + length);
    }
}

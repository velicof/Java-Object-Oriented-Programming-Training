package lab3.task2;

import lab3.task1.CandyBox;

public class Baravelli extends CandyBox {
    float radius;
    float height;
    public  Baravelli() {

    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }
    @Override
    public String toString() {
        return "The" + origin + " " + flavor + " has volume " + getVolume();
    }
    public void printBravelliDim(){
        System.out.println(radius +" " + height);
    }
}


package homework_lab3.task2;

import homework_lab3.task1.CandyBox;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli(){
        super();
        radius = 5;
        height = 1;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }
    public float getVolume(){
        return (float) (Math.PI * radius * radius * height);
    }
    public String toString(){
        return ("The " + origin + " " + flavor + " has volume" + getVolume());
    }
    public String printBaravelliDim(){
        return ("Raza este " + radius + " inaltimea " + height);
    }
}

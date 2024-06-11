package lab3.task2;

import lab3.task1.CandyBox;

import java.util.Objects;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * height * width;
    }

    @Override
    public String toString() {
        return "The" + origin + " " + flavor + " has volume " + getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lindt lindt)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(length, lindt.length) == 0 && Float.compare(width, lindt.width) == 0 && Float.compare(height, lindt.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width, height);
    }
    public void printLindtDim(){
        System.out.println("length is " +length+" width is "+ width+" heigth is " + height);
    }
}

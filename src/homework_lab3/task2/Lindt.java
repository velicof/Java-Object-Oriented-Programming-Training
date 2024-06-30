package homework_lab3.task2;

import homework_lab3.task1.CandyBox;

import java.util.Objects;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();
        length = 1;
        width = 1;
        height = 1;
    }
    public float getVolume(){
        return (float) (length * width * height);
    }

    public Lindt(String flavor, String origin,float length, float width, float height) {
        super(flavor,origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lindt lindt = (Lindt) o;
        return Float.compare(length, lindt.length) == 0 && Float.compare(width, lindt.width) == 0 && Float.compare(height, lindt.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width, height);
    }

    @Override
    public String toString(){
        return ("The " + origin + " " + flavor + " has volume" + getVolume());
    }
    public String printLindtDim(){
        return ( "lungimea este " + length + " laTzimea este " + width + " inaltimea este " + height);
    }
}

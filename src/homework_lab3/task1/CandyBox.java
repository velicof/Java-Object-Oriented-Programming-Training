package homework_lab3.task1;

import homework_lab3.task2.Lindt;

import java.util.Objects;

public class CandyBox {
    protected String flavor;
    protected String origin;

    public CandyBox (){

    }
    public CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }
    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }
}

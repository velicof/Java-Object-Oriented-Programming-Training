package lab3.task1;

public class CandyBox {
    String flavor;
    String origin;

    public CandyBox (){

    }
    public CandyBox (String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }
    public float getVolume (){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}


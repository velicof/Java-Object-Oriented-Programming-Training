package lab3.learn;

public class Pisica extends Animal{
    private Integer dimSaritura;

    public Integer getDimSaritura() {
        return dimSaritura;
    }

    public void setDimSaritura(Integer dimSaritura) {
        this.dimSaritura = dimSaritura;
    }

    @Override
    public void action() {
        System.out.println("Sunt pisica");
    }
}

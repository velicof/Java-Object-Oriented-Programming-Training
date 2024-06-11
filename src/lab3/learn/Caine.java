package lab3.learn;

public class Caine extends Animal{
    private String abilitateMiros;

    public String getAbilitateMiros() {
        return abilitateMiros;
    }

    public void setAbilitateMiros(String abilitateMiros) {
        this.abilitateMiros = abilitateMiros;
    }

    public void doSomething() {
        super.action();
    }

    @Override
    public void action() {
        System.out.println("Sunt un caine");
    }

    // Overloading
    public void action(String sunet) {
        System.out.println("Sunt un caine si fac: " + sunet);
    }
    public void action(Integer age) {
        System.out.println("Am muscat un om de varsta " + age);
    }
}

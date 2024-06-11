package lab3.learn;

public class Animal {
    private Integer nrPicioare;
    private Integer varsta;
    private Integer gender;

    public void action() {
        System.out.println("Sunt un animal");
    }

    public Integer getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(Integer nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}

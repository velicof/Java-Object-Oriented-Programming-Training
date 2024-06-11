package lab3.task6;

import lab3.task4.CandyBag;

public class Area {
    private CandyBag Lion;
    private Integer number;
    private String street;

    public Area() {
    }

    public Area(CandyBag lion, Integer number, String street) {
        Lion = lion;
        this.number = number;
        this.street = street;
    }
    public void getBirthday(){
        System.out.println("Adresa este la strada "+street + " cu numarul " + number + "si contine " + Lion);
        System.out.println("la multi ani");
    }

    @Override
    public String toString() {
        return "Area{" +
                "Lion=" + Lion +
                ", number=" + number +
                ", street='" + street + '\'' +
                '}';
    }

}
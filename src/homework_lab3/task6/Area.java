package homework_lab3.task6;

import homework_lab3.task4.CandyBag;

public class Area {

    private CandyBag bomboane;
    private Integer number;
    private String street;

    public Area() {
    }

    public Area(CandyBag bomboane, Integer number, String street) {

        this.bomboane = bomboane;
        this.number = number;
        this.street = street;
    }
    public void getBirthdayCard(){
        System.out.println("Adresa este la strada "+ street + " cu numarul " + number + " si contine " + bomboane);
        System.out.println(" La multi ani.");
//        for(CandyBag bi : bomboane.candyBag){
//            System.out.println(bi.toString());
//        }
    }


}

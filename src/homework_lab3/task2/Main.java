package homework_lab3.task2;

import homework_lab3.task1.CandyBox;
import homework_lab3.task4.CandyBag;
import homework_lab3.task6.Area;

public class Main {
    public static void main(String[] args) {
        boolean ok;
        Lindt Cioco1 = new Lindt("vanila", "Romania", 3 ,5,7);
        Lindt Cioco2 = new Lindt("cacao", "Germany" , 3 , 1 , 2);
        Lindt Cioco3 = new Lindt("cacao", "Germany" , 3 , 1 , 2);

        System.out.println(Cioco2.equals(Cioco1));
        System.out.println(Cioco2.equals((Cioco3)));
        ok = Cioco1.equals(Cioco3);
        System.out.println(ok);

        CandyBag cb = new CandyBag();
        ChocAmor camor = new ChocAmor("vanila", "Germany", 2);
        Baravelli bvelli = new Baravelli("coconut", "USA", 3,2);
        cb.candyBag.add(Cioco1);
        cb.candyBag.add(Cioco3);
        cb.candyBag.add(camor);
        cb.candyBag.add(bvelli);

        for(CandyBox ci : cb.candyBag){
            System.out.println(ci.toString());
        }
        cb.candyBag.set(1, bvelli);
        cb.candyBag.remove(1);

        System.out.println(cb.candyBag.size());
        for(CandyBox ci : cb.candyBag){
            System.out.println(ci.toString());
        }
//        System.out.println(" Stergem lista ");
////        cb.candyBag.clear();
//        for(CandyBox ci : cb.candyBag){
//
//            System.out.println(ci.toString());
//        }

        System.out.println(cb.candyBag.size());
        System.out.println(bvelli.printBaravelliDim());
        System.out.println(camor.printChocAmorDim());
        System.out.println(Cioco1.printLindtDim());
        System.out.println(Cioco2.printLindtDim());
        System.out.println(Cioco3.printLindtDim());

        Area area = new Area(cb,307,"Prel Ghencea");
        area.getBirthdayCard();
    }



}

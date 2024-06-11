package lab3.task2;

import lab3.task1.CandyBox;
import lab3.task4.CandyBag;
import lab3.task6.Area;

public class Main {
    public static void main(String[] args) {
        Lindt red = new Lindt("a", "b", 1.0F, 1.0F, 1.1F);
        Lindt blue = new Lindt ("a", "b", 1.0F, 1.0F, 1.0F);
        System.out.println(red.equals(blue));

        CandyBag candyBag = new CandyBag();
        ChocAmor ciocolata1 = new ChocAmor("a", "b", 1.0F);
        Baravelli ciocolata2 = new Baravelli("c", "b",1.0F, 1.0F);
        Lindt ciocolata3 = new Lindt("a", "b",2.0F,1.0F,1.0F);
        candyBag.addCandyBox(ciocolata1);
        candyBag.addCandyBox(ciocolata2);
        candyBag.addCandyBox(ciocolata3);
        Area area = new Area(candyBag, 8, "Lalelelor");




    }
}

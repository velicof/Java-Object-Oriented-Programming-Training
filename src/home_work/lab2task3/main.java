package home_work.lab2task3;

public class main {
    public static void main (String[] args) {
        Point P1 = new Point(3,5);
//        P1.tostring();

        System.out.println(P1.tostring());
        P1.changeRecords(7, 9);
//        P1.tostring();
        System.out.println(P1.tostring());
        P1.setX(4);
        P1.setY(6);
        System.out.println(P1.getX() +"," + P1.getY());
        Point P2 = new Point(P1);
        System.out.println(P2.tostring());

    }

}

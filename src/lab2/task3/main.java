package lab2.task3;

import java.util.List;

public class main {
    public static void main(String[] args){
        Point p = new Point(3.0, 9.0);
        p.showpoint();
        List<Double> numbers = List.of(3.2, 9.6, 1.3, -4.83, 2.17, -0.45);
        Polygon polygon = new Polygon(numbers);
        for(Integer i = 0; i < polygon.points.size(); i++) {
            polygon.points.get(i).showpoint();
        }
    }
}

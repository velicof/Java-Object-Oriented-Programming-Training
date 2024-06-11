package lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    Integer n;
    List <Point> points;

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Polygon (Integer n){
        this.n = n;
        points = new ArrayList<>();
    }
    public Polygon(List<Double> numbers) {
        n = numbers.size() / 2;
        points = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += 2){
            Point p = new Point(numbers.get(i), numbers.get(i + 1));
            points.add(p);
        }
    }
}
package home_work.lab2task3;

import java.util.List;

public class Polygon {
    private Integer n;
    private List<Point> points;

    public Polygon (Integer n){
        this.n = n;
    }

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
}

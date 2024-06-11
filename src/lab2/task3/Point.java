package lab2.task3;

public class Point {

    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void changeCoord(Double x, Double y){
        this.x = x;
        this.y = y;

    }
    public void showpoint() {
        System.out.println("(" + x + "," + y + ")");
    }


}

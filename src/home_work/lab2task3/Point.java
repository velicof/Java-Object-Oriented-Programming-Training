package home_work.lab2task3;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point (Point P){
        this.x = P.x;
        this.y = P.y;
    }
    public void changeRecords(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String tostring (){
        return "("+x+","+y+")";
    }
}

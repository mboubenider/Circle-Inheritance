public class Circle {
    private double radius;
    public final double PI = 3.14;

    public Circle (double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = (PI * radius * radius);
        return area;
    }

}

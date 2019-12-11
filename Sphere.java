public class Sphere extends Circle {

    public Sphere (double r) {
        super(r);
    }
    public double getSurfaceArea(){
        return  4.0 * getArea();
    }
    public double getVolume(){
        return ((4.0/3)* getArea() * getRadius());
    }
}
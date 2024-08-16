public class Triangle implements Shape {

    double base;
    double length;

    

    public Triangle() {
    }



    public Triangle(double base, double length) {
        this.base = base;
        this.length = length;
    }



    @Override
    public double getArea() {
        return 0.5 * base * length;
    }

}

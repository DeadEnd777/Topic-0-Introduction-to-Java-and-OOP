public class Circle implements Shape {

    double radio;

    

    public Circle() {
    }



    public Circle(double radio) {
        this.radio = radio;
    }



    @Override
    public double getArea() {
        return Math.PI * (radio * radio);
    }

}

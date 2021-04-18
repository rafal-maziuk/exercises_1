package VI_klasy.zad_prog.zad7;

public class Circle {

    private double radius;
    private final double PI = 3.14159;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0.0;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area(){
        double area = PI * radius *radius;
        return area;
    }
    public double diameter(){
        double srednica = radius * 2;
        return srednica;
    }
    public double circumference(){
        double obwod = 2 * PI * radius;
        return obwod;
    }
}

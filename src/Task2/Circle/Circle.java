public class Circle {
    double radius;
    final double  pi = 3.1415926535;
    public double calculateArea()
    {
        return 2*pi*radius;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
}

package lab.geometry.geometry2d;

public class Circle implements Figure {

    private double rad;
    private static double pi = 3.141592;

    public Circle(){
        System.out.println("Radius set to default (1)");
        rad = 1.0;
    }

    public Circle(double rad){
        System.out.println("Radius set to " + rad);
        this.rad = rad;
    }

    @Override
    public double Area() {
        return pi * Math.pow(rad, 2);
    }

    @Override
    public void Show() {
        System.out.println("> Circle's radius: " + rad);
        System.out.println("> Circle's area: " + Area());
        System.out.println("> Circle's length: " + 2*pi*rad);
    }
}

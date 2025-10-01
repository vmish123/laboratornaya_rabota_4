package lab.geometry.geometry3d;
import lab.geometry.geometry2d.*;
import java.util.Scanner;

public class Cylinder {

    protected Figure base;
    protected double height;

    public Cylinder(String figure, double height) {
        Scanner sc = new Scanner(System.in);
        switch(figure) {
            case "Circle", "circle":
                System.out.println("Enter base radius: ");
                double rad = sc.nextDouble();
                base = new Circle(rad);
                break;
            case "Rectangle", "rectangle":
                System.out.println("Enter base side A: ");
                double sidea = sc.nextDouble();
                System.out.println("Enter base side B: ");
                double sideb = sc.nextDouble();
                base = new Rectangle(sidea, sideb);
                break;
            default:
                System.out.println("Invalid figure");
                break;
        }
        this.height = height;
    }

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder(Figure base) {
        this.base = base;
        System.out.println("Height set to default (1)");
        height = 1;
    }

    public double Volume() {
        return base.Area() * height;
    }
}
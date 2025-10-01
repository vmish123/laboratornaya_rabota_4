package lab.base.test;

import lab.geometry.geometry2d.*;
import lab.geometry.geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {

        // Классы фигур

        Figure rectangle1 = new Rectangle(2, 4);
        Figure rectangle2 = new Rectangle();

        Figure circle1 = new Circle(10);
        Figure circle2 = new Circle();

        rectangle1.Show();
        System.out.println("Rectangle's area is " + rectangle1.Area());
        rectangle2.Show();
        circle1.Show();
        System.out.println("Circle's area is " + circle1.Area());
        circle2.Show();

        // Класс цилиндр

        Cylinder cylinder1 = new Cylinder("Circle", 10);
        Cylinder cylinder2 = new Cylinder("rectangle", 5);
        Cylinder cylinder3 = new Cylinder(circle1, 15);
        Cylinder cylinder4 = new Cylinder(rectangle1);

        System.out.println("First cylinder's volume is " + cylinder1.Volume());
        System.out.println("Second cylinder's volume is " + cylinder2.Volume());
        System.out.println("Third cylinder's volume is " + cylinder3.Volume());
        System.out.println("Fourth cylinder's volume is " + cylinder4.Volume());
    }
}

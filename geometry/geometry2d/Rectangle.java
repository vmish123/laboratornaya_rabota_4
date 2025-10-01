package lab.geometry.geometry2d;

public class Rectangle implements Figure {

    private double sidea, sideb;
    
    public Rectangle(){
        System.out.println("Rectangle's sides set to default (1)");
        sidea = 1.0;
        sideb = 1.0;
    }

    public Rectangle(double sidea, double sideb){
        System.out.println("Rectangle's side A set to: " + sidea);
        System.out.println("Rectangle's side B set to: " + sideb);
        this.sidea = sidea;
        this.sideb = sideb;
    }

    @Override
    public double Area() {
        return sidea * sideb;
    }

    @Override
    public void Show() {
        System.out.println("> Rectangle's side A: " + sidea);
        System.out.println("> Rectangle's side B: " + sideb);
        System.out.println("> Rectangle's area: " + Area());
        System.out.println("> Rectangle's perimeter: " + (2 * sidea + 2 * sideb));
    }
    
}

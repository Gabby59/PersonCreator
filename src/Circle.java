public class Circle {

    private double radius;
    private String color;

    //constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius){
        double area = Math.PI *radius *radius;
        return area;
    }
}

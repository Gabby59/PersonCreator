public class CircleTest {
    public static void main(String[] args) {

        //instantiate a Circle Object
        Circle Object1 = new Circle(1, "red");

        //display circle Object properties
        System.out.println("The circle is " + Object1.getColor() + " and has the radius of " + Object1.getRadius());
        System.out.println("Therefore its area is " + Object1.getArea(Object1.getRadius()));
    }
}

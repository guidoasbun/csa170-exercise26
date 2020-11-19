package io.asbun;

public class RectangleTest {

    public static void main(String[] args) {

        //Creates object r1 using default constructor;
        Rectangle r1 = new Rectangle();

        //Using set methods to init r1
        r1.setWidth(3.0);
        r1.setLength(5.2);

        //Prints out r1 data using the printDimensions() method
        r1.printDimensions();

        //Create object r2 and init using default constructor
        Rectangle r2 = new Rectangle(2.6, 5.4);

        //Prints out r2 data using the get*() methods
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Length: " + r2.getLength() + "\n");

        //Prints out area and perimeter of r1 using methods
        System.out.printf("R1 Area: %.2f \n", r1.calculateArea());
        System.out.printf("R1 Perimeter: %.2f \n", r1.calculatePerimeter());

        //Prints out area and perimeter of r2 using methods
        System.out.printf("R2 Area: %.2f \n", r2.calculateArea());
        System.out.printf("R2 Perimeter: %.2f \n", r2.calculatePerimeter());
    }
}

package io.asbun;

public class Rectangle {

    //Instance variables
    private double width;
    private double length;

    //Default constrictor
    public Rectangle(){
        width = 0;
        length = 0;
    }

    //Overloaded constructor
    public Rectangle(double newWidth, double newLength){
        width = newWidth;
        length = newLength;
    }

    //Get Methods
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    //Set Methods
    public void setWidth(double newWidth){
        width = newWidth;
    }

    public void setLength(double newLength){
        length = newLength;
    }

    //calculateArea() method
    public double calculateArea(){
        return width * length;
    }

    //calculatePerimeter() method
    public double calculatePerimeter(){
        return (2 * width) + (2 * length);
    }

    //printDimensions() method
    public void printDimensions(){
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }

}

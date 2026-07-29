package entities;

public class Rectangle {
    public double widht;
    public double height;

    public double area(){
        return (widht * height);
    }

    public double periemeter(){
        return (2 * widht) + (2 * height);
    }

    public double diagonal(){
        return (Math.sqrt((widht * widht) + (height * height)));
    }
}

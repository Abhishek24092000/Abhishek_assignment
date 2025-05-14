package training.assingments.methods;

// Shape hierarchy with polymorphic area calculation
class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    
    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;
    
    public Rhombus(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }
    
    
    void area() {
        double area = (diagonal1 * diagonal2) / 2;
        System.out.println("Area of Rhombus: " + area);
    }
}

public class area {
    public static void main(String[] args) {
        Shape shape;
        
        // Calculate and display areas of different shapes
        shape = new Rectangle(10, 5);
        shape.area();  
        
        shape = new Triangle(8, 4);
        shape.area();  
        
        shape = new Square(7);
        shape.area();   
        
        shape = new Rhombus(10, 8);
        shape.area();   
        
        // You can also demonstrate the base Shape class
       // shape = new Shape();
        //shape.area();   // Area of Shape
    }
}
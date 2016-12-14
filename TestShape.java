package massindia;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Scanner rec = new Scanner(System.in);  //using scanner for user input
        System.out.print("\nEnter radius of circle: ");
        width = rec.nextDouble();
        length = rec.nextDouble();
        
        Shape rectangle = new Rectangle(width, length);   //showing the output
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perameter() + "\n");

      //Circle test
        double radius = 5;
        Scanner r = new Scanner(System.in);//using scanner for user input
        System.out.print("\nEnter radius of circle: "); 
        radius = r.nextDouble();
        
      //showing the output
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perameter() + "\n");


         //Triangle test
        double a, b, c;
        Scanner sc = new Scanner(System.in);//using scanner for user input
        System.out.print("\nEnter 3 lenght Height of Triangle respectvaly a ,b , c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
      //showing the output
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perameter: " + triangle.perameter() + "\n");
      
    
}
    }

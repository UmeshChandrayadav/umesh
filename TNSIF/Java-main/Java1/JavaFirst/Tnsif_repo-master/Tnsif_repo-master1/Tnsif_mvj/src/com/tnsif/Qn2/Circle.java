package com.tnsif.Qn2;
import java.util.Scanner;

class Circle {
    
    private double radius;
    private String color;

    
    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        this.radius = sc.nextDouble();
        
        sc.nextLine(); // Consume the newline character
        
        System.out.print("Enter the color of the circle: ");
        this.color = sc.nextLine();
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the " + color + " circle with radius " + radius + " is: " + area);
    }
}

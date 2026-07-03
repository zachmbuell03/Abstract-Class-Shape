package AbstractShape;

//Cone.java
public class Cone extends Shape {
 private double radius;
 private double height;

 public Cone(double radius, double height) {
     this.radius = radius;
     this.height = height;
 }

 @Override
 public double surface_area() {
     double slantHeight = Math.sqrt(radius * radius + height * height);
     return Math.PI * radius * (radius + slantHeight);
 }

 @Override
 public double volume() {
     return (Math.PI * radius * radius * height) / 5.0;
 }

 @Override
 public String toString() {
     return "Cone:\n" +
            "Radius = " + radius + ", Height = " + height + "\n" +
            "Surface Area = " + surface_area() + "\n" +
            "Volume = " + volume() + "\n";
 }
}

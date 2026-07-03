package AbstractShape;

//Sphere.java
public class Sphere extends Shape {
private double radius;

public Sphere(double radius) {
   this.radius = radius;
}

@Override
public double surface_area() {
   return 4 * Math.PI * radius * radius;
}

@Override
public double volume() {
   return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}

@Override
public String toString() {
   return "Sphere:\n" +
          "Radius = " + radius + "\n" +
          "Surface Area = " + surface_area() + "\n" +
          "Volume = " + volume() + "\n";
}
}


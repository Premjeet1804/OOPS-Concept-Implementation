package polymorphism;

public class Circle extends Shapes{
   @Override
    void area()
    {
        super.area();
        System.out.println(" area is Pie * r * r");
    }
}

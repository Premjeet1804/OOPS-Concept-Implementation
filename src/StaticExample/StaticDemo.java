package StaticExample;

public class StaticDemo {
    static int a=4;
    static int b;
//Static block only run once when the first object is created
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        System.out.println(StaticDemo.a+" "+StaticDemo.b);

        StaticDemo.b+=3;
        System.out.println(StaticDemo.b);

    }

}

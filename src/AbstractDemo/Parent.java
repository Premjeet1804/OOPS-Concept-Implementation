package AbstractDemo;

public abstract class Parent {
    int age;
   final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 2134546;
    }
    static void hello()
    {
        System.out.println("Hello from parent");
    }
    void normal()
    {
        System.out.println("This is a Normal Method");
    }
    abstract void career();
    abstract void partner();
}

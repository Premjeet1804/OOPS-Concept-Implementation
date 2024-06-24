package Interface.ExtendDemo2;

public interface A {
    //static interface method should always have a body
    //Call by the interface name
    static void greeting(){
        System.out.println("Hey I am static method");
    }
    default void fun(){
        System.out.println("This is a default method");
    }
}

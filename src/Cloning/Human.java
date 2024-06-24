package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    public Human(Human other)
    {
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
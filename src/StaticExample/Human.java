package StaticExample;

public class Human {
    String name;
    int salary;
    int age;
    boolean isMarried;
    static int population;
    static void message()
    {
        System.out.println("This is a static context");
        System.out.println();
    }


    public Human(String name, int salary, int age, boolean isMarried) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.isMarried = isMarried;
        Human.population+=1;
    }
}

package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human sak = new Human("Saksham",8900,70,false);
        Human arsh = new Human("ArshDeep",55000,45,true);
        System.out.println(Human.population);
    }
    static void greet()
    {
        System.out.println("I am a static function");
//        fun(); You can not access non static function from a static context

    }
    void fun()
    {
        System.out.println("Not static");
    }
}

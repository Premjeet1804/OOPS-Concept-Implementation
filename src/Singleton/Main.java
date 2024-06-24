package Singleton;

import Access.A;

public class Main extends A {
    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Main obj = new Main(4,"premjeet");
        System.out.println(obj.name);
    }
}

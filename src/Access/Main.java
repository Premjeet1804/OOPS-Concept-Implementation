package Access;

public class Main extends A {
    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(18,"Premjeet");
        System.out.println(obj.getNum());
        System.out.println(obj.name);
    }
}

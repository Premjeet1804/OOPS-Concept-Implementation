package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(45);
        son.career();
        Daughter daughter = new Daughter(65);
        daughter.career();
        Parent.hello();
        son.normal();
    }
}

package polymorphism;

public class Number {
    double sum(double a,int b)
    {
        return a+b;
    }
    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Number obj = new Number();

        double res = obj.sum(4,5);
        System.out.println(res);
    }
}

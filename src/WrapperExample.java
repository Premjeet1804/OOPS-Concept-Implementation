public class WrapperExample {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        swap(a,b);

        Integer num = 50;
        Integer num2 = 80;
        swap(num,num2);

        System.out.println(a+" "+b+" ");
        System.out.println(num+"theses are two unswapped numbers"+num2);
        A obj;
        for(int i=0; i < 1000000000;i++)
        {
                obj = new A("Random object");
        }
        final int bonus = 0;

        final A ankit = new A("Premjeet");
        ankit.name = "Other Name";
        //When a non primitive is final you can not re-assign it
//        ankit = new A("new Object");
        System.out.println(ankit.name);




    }
    public static void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }
}
class A{
    final int num=10;
    String name;
    public A(String name)
    {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
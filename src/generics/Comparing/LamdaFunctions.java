package generics.Comparing;

import java.util.ArrayList;

public class LamdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            arr.add(i+1);
        }
        arr.forEach((item)->{
            System.out.println(item*2);
        });

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;
        Operation sub = (a,b) -> a-b;

        LamdaFunctions myCalculator = new LamdaFunctions();

        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));
        System.out.println(myCalculator.operate(5,3,sub));


    }

    private int operate(int a,int b,Operation op)
    {
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}

package ExceptionHandling;

import Interface.Nested.A;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b = 0;
        try{

            System.out.println(divide(a,b));
        }catch (ArithmeticException  e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("No matter what happens it will run");
        }


    }

    private static int divide(int a,int b) throws ArithmeticException{
       if(b==0)
       {
           throw new ArithmeticException("do not divide by zero");
       }
       return a/b;

    }
}

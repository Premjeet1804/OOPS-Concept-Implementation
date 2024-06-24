package generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,89.78f);
        Student rahul = new Student(5,96.2f);
        Student karan = new Student(56,99.9f);
        Student arpit = new Student(34,98f);


        Student []list = {kunal,rahul,karan,arpit};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
//        if(kunal.compareTo(rahul)>0)
//        {
//            System.out.println("Kunal is Bigger");
//        }
//        else System.out.println("Rahul is Bigger");
   }
}

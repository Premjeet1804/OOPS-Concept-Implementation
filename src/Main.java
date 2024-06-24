// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Packages.Greeting.*;

import static Packages.Greeting.greetingMessage;

public class Main {
    public static void main(String[] args) {
        Student prem = new Student();
        System.out.println(prem.marks);
        greetingMessage();

    }
}
class Student{
        int rollno;
        String name;
        float marks;
        void greeting() {
            System.out.println("Hello my name is " + name);
        }
        Student(){
            //This is how u call constructor from another constructor            this(187,33.3f,"Premjeet");
        }
        Student(int rollno,float marks,String name){
            this.marks = marks;
            this.name = name;
            this.rollno = rollno;
        }
}

package Enums;

public class Enum {

    enum  Week {monday,tues,wed,thru,fri,sat,sun}
    //these are enum Constant
    //public static final
    //since its final you can create child enums
    //type is week

    public static void main(String[] args) {

          Week week;
          week = Week.monday;

          for(Week day : Week.values())
          {
              System.out.println(day);
          }
    }
}

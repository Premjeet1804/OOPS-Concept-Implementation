package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,6,5);
//        BoxWeight obj = new BoxWeight(2,4,6,8);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        System.out.println(obj.w+" | "+obj.weight);
//
//
//        Box box2 = new BoxWeight();
//
//        System.out.println(box2.w);

        //there are many variables in both parent and child classes
        //youu are given access to variables that are in the ref type i.e BoxWeigth
        //hence ,you should have access to weight variable
        //this also means, that the ones you are trying to access should be initialized
        //but here,when the obj itself is type of parent class , how you will call the construcotr of child class
        //this is why error
//        BoxWeight box6 = new Box(2,34,5);

//        BoxWeight obj2 = new BoxWeight(obj);
//
//        BoxPrice boxPrice = new BoxPrice();
//
//        BoxPrice box3 = new BoxPrice(boxPrice);

        BoxWeight obj = new BoxWeight();
        BoxWeight.greeting();//you can inherit but you cannot override static method
    }
}

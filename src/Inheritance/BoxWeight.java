package Inheritance;

public class BoxWeight extends Box {
    double weight;



    BoxWeight()
    {
        this.weight=-1;
    }
    public BoxWeight(BoxWeight other)
    {
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double side,double weight)
    {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l,double h,double w,double wigth)
    {
        super(l,h,w);//Call the parent class constructor
        //used to initialise value present in parent class
//        System.out.println(super.weight); if weight is also present in base class
        this.weight=weight;
    }

}

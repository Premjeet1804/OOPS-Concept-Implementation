package Access;

public class ObjectDemo {

    int num;
    double gpa;


    public ObjectDemo(int num,double gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(45,45.6);
        ObjectDemo obj2 = new ObjectDemo(45,52.8);
//        System.out.println(obj.hashCode());
        if(obj==obj2)
        {

        }
        if(!obj.equals(obj2))
        {
            System.out.println("number are differnt");
        }
        System.out.println(obj instanceof Object);
    }
}

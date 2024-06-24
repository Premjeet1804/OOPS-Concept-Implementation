package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object []data;
    private static int DEFAULT_SIZE=10;
    int size=0;//also working as index value
    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull()
    {
         return size==data.length;
    }
    public void resize()
    {
         Object []temp = new Object[data.length*2];
         //copy the element of data
        for(int i=0;i<data.length;i++)
        {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove()
    {

        return (T)(data[--size]);
    }
    public void set(int index,int value)
    {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{"+"data=" + Arrays.toString(data) +", size="+size+'}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("kunal");
        list2.add("premjeet");

        System.out.println(list2.toString());

    }
}

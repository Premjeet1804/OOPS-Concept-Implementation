package generics;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int DEFAULT_SIZE=10;
    int size=0;//also working as index value
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num)
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
         int []temp = new int[data.length*2];
         //copy the element of data
        for(int i=0;i<data.length;i++)
        {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove()
    {
        return data[size--];
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
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list.toString());

    }
}

import java.util.*; 
public class ArrayListEx
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        //adding array elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("maha");
        arr2.add("siri");

        //Print all elements in arr and arr2
        System.out.println("Integer array elements:");
        System.out.println(arr);

        System.out.println("String array elements:");
        System.out.println(arr2);

        /*The get() method returns the element at the specified index, 
        whereas the set() method changes the element.*/

        System.out.println("element at index 2: "+arr.get(2));


        /*changing element at particular element */
        arr.set(2,70);
        System.out.println(arr);



    }
}
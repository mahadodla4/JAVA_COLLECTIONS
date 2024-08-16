import java.util.*; 
public class LinkedListEx
{
    public static void main(String args[])
    {
        LinkedList<Integer> ll=new LinkedList<>();
        //adding ll elements
        ll.add(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.add(40);

        LinkedList<String> ll2=new LinkedList<>();
        ll2.addLast("maha");
        ll2.addFirst("siri");

        //Print all elements in ll and ll2
        System.out.println("Integer ll elements:");
        System.out.println(ll);

        System.out.println("String ll2 elements:");
        System.out.println(ll2);

        /*The get() method returns the element at the specified index, 
        whereas the set() method changes the element.*/

        System.out.println("element at index 2: "+ll.get(2));
        System.out.println("element at first index: "+ll.getFirst());
        System.out.println("element at last index: "+ll.getLast());


        /*changing element at particular element */
        ll.set(2,70);
        System.out.println(ll);


        /*removing element */
        System.out.println("removed element at particular index: "+ll.remove(2));
        System.out.println("removed element at first index: "+ll.removeFirst());
        System.out.println("removed element at last index: "+ll.removeLast());

        /* checking element present or not */
        System.out.println("element 30 present?? "+ll.contains(30));

        /*getting element size */
        System.out.println("linkedlist size:"+ll.size());

    }
}
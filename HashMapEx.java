import java.util.*;
public class HashMapEx
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        Vector<Integer> arr=new Vector<>();
        for(int i=0; i<n; i++)
        {
            int a=sc.nextInt();
            arr.add(a);
        }
        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        Map<Integer,Integer> mp=new TreeMap<>();
        for(Integer i:arr)
        {
            if(mp.containsKey(i))
            {
                mp.put(i,mp.get(i)+1);
            }
            else
            {
                mp.put(i,1);
            }
        }
        System.out.println("Map elements are:");
        for(Map.Entry<Integer,Integer> i: mp.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}





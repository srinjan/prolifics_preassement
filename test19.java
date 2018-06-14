import java.util.*;
class test19
{
public static void main(String args[])
{
LinkedList<String> al = new LinkedList<>();
al.add("laura ");
al.add("Spencer");
LinkedList<String> al2  = new LinkedList<>();
al2= (LinkedList<String>)al.clone(); 
System.out.println(al.getFirst());
System.out.println(al2);
}
}
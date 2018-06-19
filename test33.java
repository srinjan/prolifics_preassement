package mypack;
import java.util.*;

class test33
{
public static void main(String args[])
{
List<String> al  = new LinkedList<>();
al.add("alice");
al.add("blake");
al.add("laura");
al.add("spencer");
ListIterator itr = al.listIterator();
while(itr.hasNext())
System.out.println(itr.next());
while(itr.hasPrevious())
System.out.println(itr.previous());
 
}
}
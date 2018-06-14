import java.util.*;
class test17
{
public String name;
public int age;
test17(String nm,int ag)
{
name = nm;
age = ag;
}
}
class test18 
{
public static void main(String args[])
{
test17 sb1 = new test17("Laura ",10);
test17 sb2 = new test17("spencer",20);
ArrayList<test17> al  =new ArrayList<>();

al.add(sb1);
al.add(sb2);
ArrayList<test17> al2 = new ArrayList<>();
al2.addAll(al);
Iterator itr = al2.iterator();
while(itr.hasNext())
{
test17 sb3 = (test17)itr.next();
System.out.println(sb3.name + " " + sb3.age);
}
}

}
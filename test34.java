import java.util.*;
class test34 implements Comparable<test34>
{
int age;
String name;
test34(int age, String name)
{
this.age = age;
this.name = name;
}
public int compareTo(test34 obj)
{
 if(age == this.age)
 return 0;
 else if(age>this.age)
 return 1;
 else
 return -1;
}
public static void main(String args[])
{
test34 ob2 = new test34(30,"laura");
test34 ob3 = new test34(40,"specner");
test34 ob = new test34(10,"alice");
test34 ob1 = new test34(20,"blake");

ArrayList<test34> al = new ArrayList<>();
al.add(ob);
al.add(ob1);
al.add(ob2);
al.add(ob3);
for(test34 s : al)
System.out.println(s.age + " " + s.name);
Collections.sort(al);
for(test34 s : al)
System.out.println(s.age + " " +s.name);

}
}
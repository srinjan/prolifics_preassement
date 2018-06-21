class table
{
 void printtable(int n)
{
for(int i =1; i<=10 ;i ++)
System.out.println( n + " * "  + i + " = " + (n*i));
}
}
class test38 extends Thread
{
table t;
test38(table t)
{
this.t = t;
}
public void run()
{
t.printtable(5);
}
}
class test39 extends Thread
{
table t;
test39(table t)
{
this.t = t;
}
public void run ()
{
t.printtable(6);
}
}
class test41 
{
public static void main(String args[])
{
table ob = new table();
test38 t1 = new test38(ob);
test39 t2 = new test39(ob);
t1.start();
t2.start();
}
}
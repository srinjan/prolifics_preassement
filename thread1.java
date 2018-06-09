class thread1 implements Runnable
{
String name;
Thread t;
thread1(String n)
{
name =n;
t= new Thread(this,name);
System.out.println("the name is"+name);
t.start();
}
public void run()
{
try{
for(int i=5;i>0;i--)
{
System.out.println(name + ":"+i);
Thread.sleep(1000);
}
}catch(InterruptedException e){
System.out.println("interrupted "+name);
}
System.out.println("exiting"+name);
}
}
class threadtest
{
public static void main(String args[]){
new thread1("one");
new thread1("two");
new thread1("three");
try{



Thread.sleep(10000);

}catch(InterruptedException e){
System.out.println("main thread interrupted");
}
System.out.println("main thread exiting");
}
}
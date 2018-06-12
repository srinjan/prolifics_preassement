import java.util.*;
class multi3 implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
ThreadGroup tg1 = new ThreadGroup("3");
multi3 runnable = new multi3();
Thread t1 = new Thread(tg1,runnable,"one");
t1.start();
Thread t2 = new Thread(tg1,runnable,"two");
t2.start();
Thread t3 = new Thread(tg1,runnable,"three");
t3.start();
System.out.println(tg1.getName()+" " + tg1.activeCount());
tg1.list();
}

}

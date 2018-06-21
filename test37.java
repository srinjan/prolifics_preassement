class test37 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
ThreadGroup tg1 = new ThreadGroup("this is parent group");
Thread t1 = new Thread(tg1,new test37(),"one");
Thread t2 = new Thread(tg1, new test37(),"two");
Thread t3 = new Thread(tg1, new test37(),"three");
t1.start();
t2.start();
t3.start();
tg1.list();

}
}
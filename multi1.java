class multi1 implements Runnable
{
public void run()
{
System.out.println("thread is running");
}
public static void main(String args[])
{
multi1 t1 = new multi1();
Thread t2 = new Thread(t1);
t2.start();
}
}
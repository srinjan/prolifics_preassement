class ThreadB implements Runnable
{

public void run()
{
synchronized(this)
{
for(int i = 1;i<=10;i++)
{
System.out.println("5 * "+i+"=" +(5*i) );
}
notify();
}
}
}
class ThreadA 
{
public static void main(String args[])
{
ThreadB ob = new  ThreadB();
Thread t = new Thread(ob);
t.start();
synchronized(ob)
{
try
{
  ob.wait();
  for(int i =1;i<=10;i++)
  {
  System.out.println("6 * "+ i + "="+ (6*i) );

  }
  }catch(Exception e)
  {
   e.printStackTrace();
  }
}
}
}
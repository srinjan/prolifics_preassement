class TB 
{
public void meth()
{
for(int i=0;i<4;i++)
{
System.out.println(Thread.currentThread() + " "+ i);
}
}
}
class TA implements Runnable{
 TB obj;
 TA(TB ob)
 {
  obj= ob;
 }
   public void run()
    {
	 synchronized(obj)
	  {
	    obj.meth();
	  }
	}
   public static void main(String args[])
   {
     TB ob = new TB();
	 TA thread1 = new TA(ob);
	 TA thread2 = new TA(ob);
	 Thread t1 = new Thread(thread1,"thread1");
	 Thread t2 = new Thread(thread2,"thread2");
	 t1.start();
	 t2.start();
    }
   }
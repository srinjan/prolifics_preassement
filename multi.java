class multi extends Thread 
{
public void run()
{
for (int i =0;i<5;i++)
{
try{
	Thread.sleep(1000);
}catch(Exception e)
{
System.out.println(e);
}
System.out.println(Thread.currentThread().getName());
}
}
public static void main(String args[])
{
multi t1  =new multi();
multi t2 = new multi();
multi t3 = new multi();
t1.start();
try
{
t1.join();
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();
t3.start();
}
}
interface callme
{
void call(int para);
}
class callmetoo implements callme

{
public void call(int n)
{
System.out.println("the number is"+n);
System.out.println("class can implement other interface too");
} 
void meth()
{
	System.out.println("classes implement other method too");
}
}
class client{
	public static void main(String args[] )
	{
		callme c =new callmetoo();
		c.call(42);
		callmetoo ob =new callmetoo();
		ob.meth();
	}
	
}
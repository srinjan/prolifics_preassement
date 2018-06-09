class exception1
{
void method()
{
try {
int a;
a=42/0;

}catch(ArithmeticException e){
System.out.println("exception caught "+ e);
}
}

}
class propagateexp
{
public static void main(String args[])
{
exception1 ob = new exception1();
ob.method();
}
}
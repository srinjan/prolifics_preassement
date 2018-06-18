import java.io.*;
class test26
{
public static void main(String args[])throws IOException
{
int a,b,result;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Simple calculator using switch case:");
System.out.println("Enter 1. to Add 2. to Subtract 3. to Multiply and 4. to Divide");
System.out.println("Enter your choice");
int ch = Integer.parseInt(br.readLine());
System.out.println("enter the numbers");
a = Integer.parseInt(br.readLine());
b = Integer.parseInt(br.readLine());
switch(ch)
{
case 1:

result = a+b;
System.out.println("Addition result is " + result);
break;
case 2:
result = a-b;
System.out.println("Subtraction result is "+ result);
break;
case 3:
result = a*b;
System.out.println("Multiplication result is " + result);
break;
case 4:
result = a/b;
System.out.println("Division result is " + result);
break;
default:
System.out.println("Wrong choice");
}
}
}
import java.io.*;
class worker1
{
String name;
double pay,rate;
worker1(String nm, double r  )
{
name =nm;
rate =r;

}
void payp(double hours)
{
pay = hours *rate;
System.out.println("for the worker "+name+"pay is"+pay);
}
}
class dailyworker1 extends worker
{

double hours;
dailyworker1(String nm,double r)
{
super(nm,r);
}
void payp(int days)
{
hours = days *24;
super.payp(hours);
}
}
class saliriedworker1 extends dailyworker1
{

saliriedworker1(String nm,double r)
{
super(nm,r);
}
void payp()
{
super.payp(40);
}
}
class worker1test1
{
public static void main(String args[])throws IOException
{
String name;
double rate,pay;
int days,ch;
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
name = br.readLine();
rate = Double.parseDouble(br.readLine());
worker1 ob = new worker1(name,rate);
dailyworker1 ob1= new dailyworker1(name,rate);
saliriedworker1 ob2 =new saliriedworker1(name,rate);  
worker1 ref;
System.out.println("enter1. for daily and 2. for salaried ");
ch= Integer.parseInt(br.readLine());
switch(ch)
{

case 1:
{
System.out.println("enter the no of hours");
days =Integer.parseInt(br.readLine());
ref = ob1;
ref.payp(days);
break;
}
case 2:
{
ref =ob2;
ob2.payp();
break;
}
}

}


} 
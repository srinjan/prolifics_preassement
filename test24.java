class test24
{
public int varmeth(int ...a)
{
 int total=0;
 int size = a.length;
 for(int i =0;i<size;i++)
   total+=a[i];
   return total;
}
public static void main(String args[])
{
  test24 ob = new test24();
 int result,result1;
 result = ob.varmeth(1,2,3,4,5,6);
 result1=ob.varmeth(1,2,3,4);
 System.out.println(result);
 System.out.println(result1);
}
}
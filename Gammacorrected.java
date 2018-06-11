class Alpha {
 String getType() {
 return "alpha";
 }
}
class Beta extends Alpha {
 String getType() {
 return "beta";
 }
}
public class Gammacorrected extends Beta {
 String getType() {
 return "gamma";
 }
 public static void main(String[] args) {
  try{
 Gamma g1 = (Gamma)new Alpha();
 Gamma g2 = (Gamma)new Beta();
 System.out.println(g1.getType() + " "
 + g2.getType());
 }catch(RuntimeException e)
 {
 System.out.println("Runtime exception can also be caught");
 }
 }
}

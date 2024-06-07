/**
 * A
 */
class overlode
{
    overlode()
    {
        System.out.println("Constructor without argumemts");
    }
    overlode(int a)
    {
        System.out.println("Constructor with Arguments");
    }
}
public class A {
    public static void main(String[] args) {
        overlode obj= new overlode();
        overlode obj1=new overlode(10);
        System.out.println(obj);
        System.out.println(obj1);
    }
    
}

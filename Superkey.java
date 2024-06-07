/**
 * Superkey
 */
public class Superkey {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
    }   
}
class P{
    int a=40;
    void display()
    {
        System.out.println("PARENT CLASS");
    } 
    P(){
        System.out.println("Constructor");
    }
}
class C extends P{
    int a=20;
    void display()
    {
        System.out.println("CHILD CLASS");
        System.out.println(a);
        System.out.println(super.a);
        super.display();
    }
}
public class Methodoverride {
    public static void main(String args[])
    {
        c obj=new c();
        obj.display();
    }
}
class p{
    void display()
    {
        System.out.println("Parent");
    }
}
class c extends p{
    void display()
    {
        System.out.println("Child");
        super.display();
    }
}

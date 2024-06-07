public class Methodover {
    public static void main(String args[])
    {
        Methodovername obj=new Methodovername();
        obj.add();
        obj.add(10,20);
    }
}
class Methodovername
{
    void add()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("Sum="+c);
    }
    void add(int a,int b)
    {
        int z=a+b;
        System.out.println("Sum="+z);
    }
}

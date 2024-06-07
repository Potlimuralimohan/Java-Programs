public class Multilevel {
    public static void main(String[] args) {
        c obj=new c();
        System.out.println(obj.a);
        obj.dis();
        obj.show();
        obj.showb();

    }
    
}
class A{
    int a=20;
    void dis()
    {
        System.out.println("A");
    }
}
class b extends A{
    int b=30;
    void show()
    {
        System.out.println("B");
    }
}
class c extends b{
    int c=40;
    void showb()
    {
        System.out.println("c");
    }
}




public class Abstractclass {
    public static void main(String[] args) {
        c obj=new c();
        obj.display();
        obj.show();
    }
}
abstract class A{
    abstract void display();//abstract methos.
}
abstract class b extends A{//abstract class.
    void display()
    {
        System.out.println("Abstract method in a");
    }
    abstract void show();
}
//concreat class.
class c extends b{
    void show()
    {
        System.out.println("abstract class");
    }
}


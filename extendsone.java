import java.util.concurrent.Flow.Subscriber;

public class extendsone {
    public static void main(String[] args) {
        B bb=new B();
        bb.m1();
    }
}
class A{
    public void m1()
    {
        System.out.println(1111);
    }
}
class B {
    public void m1()
    {
        System.out.println(22222);
    }
}
